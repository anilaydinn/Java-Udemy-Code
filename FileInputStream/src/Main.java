import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("dosya.txt");
			
			int deger;
			
			String s = "";
			
			int say = 0;
			
			fis.skip(5);
			
			while((deger = fis.read()) != -1) {
				
				s += (char)deger;
				
				say++;
				
				if(say == 10) {
					
					break;
				}
			}
			
			System.out.println("Dosyanın 5. Yerinden itibaren 10 karakter : " + s);
			
			/*
			while((deger = fis.read()) != -1) {
				
				s += (char)deger;
			}
			
			System.out.println("Dosya İçeriği : " + s);
			*/
			
			/*
			System.out.println("Birinci Karakter : " + (char)fis.read());
			System.out.println("İkinci Karakter : " + (char)fis.read());
			System.out.println("Üçüncü Karakter : " + (char)fis.read());
			*/
			
			//fis.skip(5);
			
			/*
			System.out.println("İlk Karakter : " + (char)fis.read());
			System.out.println("İkinci Karakter : " + (char)fis.read());
			*/
		}
		catch(FileNotFoundException e) {
			
			System.out.println("File bulunamadı...");
		} catch (IOException e) {
			
			System.out.println("Dosya okunurken hata oluştu...");
		}
		finally {
			
			 try {
				 
				 if(fis != null) {
					
					 fis.close();
				 }
			 }
			 catch(IOException e) {
				 
				 System.out.println("Dosya kapatılırken bir hata oluştu...");
			 }
		}
	}
}
