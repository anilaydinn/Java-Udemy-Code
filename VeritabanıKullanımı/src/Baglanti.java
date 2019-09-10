import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Baglanti {

	private String kullanici_adi = "root";
	private String parola = "";
	
	private String db_ismi = "demo";
	
	private String host = "localhost";
	
	private int port = 3306;
	
	private Connection con = null;
	
	private Statement statement = null;
	
	private PreparedStatement preparedStatement = null;
	
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
	
	public Baglanti() {
		
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
		
		Baglanti baglanti = new Baglanti();
		
		//System.out.println("Silinmeden Önce......");
		
		baglanti.preparedCalisanlariGetir(1);
		
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
