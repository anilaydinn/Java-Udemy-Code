import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Currency;

public class Main {

	private static ArrayList<Integer> icerik = new ArrayList<Integer>();
	
	public static void dosyaOku() {
		
		try {
			
			FileInputStream in = new FileInputStream("no1.mp3");
			
			int oku;
			
			while((oku = in.read()) != -1) {
				
				icerik.add(oku);
			}
		}
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void kopyala(String dosyaismi) {
		
		try {
			
			FileOutputStream out = new FileOutputStream(dosyaismi);
			
			for(int deger : icerik) {
				
				out.write(deger);
			}
		}
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		dosyaOku();
		long baslangic = System.currentTimeMillis();
		
		kopyala("no2.mp3");
		kopyala("no3.mp3");
		kopyala("no4.mp3");
		
		long bitis = System.currentTimeMillis();
		
		System.out.println("3 dosyanın kopyalanması şu kadar sürdü : " + ((bitis - baslangic)/ 1000) + "saniye");
	}
}
