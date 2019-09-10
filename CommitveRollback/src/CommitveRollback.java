import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class CommitveRollback {

	private String kullanici_adi = "root";
	private String parola = "";
	
	private String db_ismi = "demo";
	
	private String host = "localhost";
	
	private int port = 3306;
	
	private Connection con = null;
	
	private Statement statement = null;
	
	private PreparedStatement preparedStatement = null;
	
	/*
	 	Database Transaction
	 	
	 	Çoğu zaman programlarımızda bir çok veritabanı işlemini ard arda yaparız.
	 	Örneğin elimizde birbiriyle bağlantılı 3 tane tablo güncelleme işlemimiz var(delete, update).
	 	Bu işlemleri ve sorguları ard arda çalıştırdığımızı düşünelim.
	 	
	 	statement.executeUpdate(sorgu1);
	 	statement.executeUpdate(sorgu2);	//Burada herhangi bir hata oldu ve programımız sona erdi.
	 	statement.executeUpdate(sorgu3);
	 	
	 	Böyle bir durumda 2.sorgumuzda herhangi bir hata oluyor.
	 	Ancak 1.sorguda hata olmadığı için bu sorgumuz veritabanımızı güncelledi.
	 	Ancak bu sorgular birbiriyle bağlantıılı ise 1.sorgunun da çalışmaması gerekiyor.
	 	İşte biz böyle durumların önüne geçmek için Transactionları kullanıyoruz.
	 	
	 	(ATM Örneği)
	 	
	 	Transaction mantığını kullanmak için bu sorguların sadece hiçbir sorun oluşmadığında
	 	toplu çalışmasını istiyoruz.
	 	
	 	Java bu sorguları yazdığımız andan itibaren otomatik olarak sorguları sorgusuz sualsiz 
	 	çalıştırır. Onun için ilk olarak con.setAutoCommit(false) şeklinde bir şey yaprak bu durumu
	 	engelliyoruz.
	 	
	 	 commit() : Bütün sorguları çalıştır. Sorun olmadığı zaman hepsini çalıştırmak için kullanıyoruz.
	 	 rollback() : Bütün sorguları iptal et. Sorun olduğu zaman hiçbirini çalıştırmamak için kullanıyoruz.
	 	 
	 	 Yani bu sefer programlarımızı biraz daha güvenli yazmış oluyoruz.
	 	 
	 	 Not : setAutoCommit(false) yazsak bile Veritabanını güncellemeyen bir sorgumuz varsa,
	 	 herhangi bir güvenlik sıkıntı olmayacağından çalıştırılır.
	 */
	
	public void preparedCalisanlariGetir(int id) {
		
		String sorgu = "Select * from calisanlar where id > ? and ad like ?";
		
		try {
			
			preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, "M%");
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				
				String ad = rs.getString("ad");
				String soyad = rs.getString("soyad");
				String email = rs.getString("email");
				
				System.out.println("Ad : " + ad + " Soyad : " + soyad + " Email : " + email);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void calisanEkle() {
		
		try {
			
			statement = (Statement) con.createStatement();
			
			String ad = "Semih";
			String soyad = "Aktaş";
			String email = "semihaktas@gmail.com";
			
			String sorgu = "INSERT INTO calisanlar (ad,soyad,email) VALUES ('" + ad + "','" + soyad +"','" + email + "')";
			
			statement.executeUpdate(sorgu);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void calisanSil() {
		
		try {
			
			statement = (Statement) con.createStatement();
			
			String sorgu = "Delete from calisanlar where id > 3";
			
			int deger = statement.executeUpdate(sorgu);
			
			System.out.println(deger + " kadar veri etkilendi...");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void calisanGuncelle() {
		
		try {
			
			statement = (Statement) con.createStatement();
			
			String sorgu = "Update calisanlar set email = 'example@gmail.com' where id > 3";
			
			statement.executeUpdate(sorgu);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void commitverollback() {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			con.setAutoCommit(false);
			
			String sorgu1 = "delete from calisanlar where id = 3";
			String sorgu2 = "update calisanlar set email = 'mustafamuratcoskun@gmail.com' where id = 1";
			
			System.out.println("Güncellenmeden Önce");
			calisanlariGetir();
			
			Statement statement = con.createStatement();
			
			statement.executeUpdate(sorgu1);
			statement.executeUpdate(sorgu2);
			
			System.out.println("İşlemleriniz kaydedilsin mi ?(yes/no)");
			
			String cevap = scanner.nextLine();
			
			if(cevap.equals("yes")) {
				
				con.commit();
				calisanlariGetir();
				System.out.println("Veritabanı güncellendi...");
			}
			else {
				
				con.rollback();
				System.out.println("Veritabanı güncellenmesi iptal edildi...");
				calisanlariGetir();
			}
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
	}
	
	public void calisanlariGetir() {
		
		String sorgu = "Select * From calisanlar";
		
		try {
			
			statement = (Statement) con.createStatement();
			
			ResultSet rs = statement.executeQuery(sorgu);
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String ad = rs.getString("ad");
				String soyad = rs.getString("soyad");
				String email = rs.getString("email");
				
				System.out.println("Id : " + id + " Ad: " + ad + " Soyad : " + soyad + " Email : " + email);
			}
		}
		catch(SQLException e) {
			
			
		}
	}
	
	public CommitveRollback() {
		
		//"jdbc:mysql://localhost:3306/demo"
		String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			
			System.out.println("Driver Bulunamadı....");
		}
		
		try {
			
			con = DriverManager.getConnection(url, kullanici_adi, parola);
			System.out.println("Bağlantı başarılı...");
		} catch (SQLException e) {
			
			System.out.println("Bağlantı Başarısız...");
		}
	}
	
	public static void main(String[] args) {
		
		CommitveRollback comroll = new CommitveRollback();
		
		
		comroll.commitverollback();
		
		
		
		//System.out.println("Silinmeden Önce......");
		
		//baglanti.preparedCalisanlariGetir(1);
		
		/*baglanti.calisanlariGetir();
		System.out.println("*******************************");
		System.out.println("Silindikten Sonra......");
		baglanti.calisanSil();
		baglanti.calisanlariGetir();
		*/
		
		//baglanti.calisanGuncelle();
		//baglanti.calisanlariGetir();
		
		
		//baglanti.calisanEkle();
		//baglanti.calisanlariGetir();
	}
}
