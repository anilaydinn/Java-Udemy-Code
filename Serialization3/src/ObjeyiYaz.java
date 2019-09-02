import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Anıl Aydın", 132, "Yazılım Mühendisliği");
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
			
			Ogrenci.setOgrenci_sayisi(100);
			
			out.writeObject(ogrenci1);
		}
		catch(FileNotFoundException e) {
			
			System.out.println("Dosya bulunamadı...");
		}
		catch(IOException e) {
			
			System.out.println("Dosya açılırken IOException oluştu...");
		}
	}
}
