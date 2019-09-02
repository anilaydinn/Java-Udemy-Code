import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OyunKayıt {

	public static void oyunKaydet(Kart[][] kartlar) {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))){
			
			System.out.println("Oyun kaydediliyor...");
			out.writeObject(kartlar);
		}
		catch(FileNotFoundException e) {
			
			System.out.println("Dosya bulunamadı...");
		}
		catch(IOException e) {
			
			System.out.println("Dosya açılırken IOException oluştu...");
		}
	}
	
	public static Kart[][] kayittanAl(){
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin"))){
			
			Kart[][] cikti = (Kart[][])in.readObject();
			
			return cikti;
		}
		catch(FileNotFoundException e) {
			
			System.out.println("Dosya bulunamadı...");
		}
		catch(IOException e) {
			
			System.out.println("Dosya açılırken IOException oluştu...");
		}
		catch(ClassNotFoundException e) {
			
			System.out.println("Sınıf bulunamadı...");
		}
		
		return null;
	}
}
