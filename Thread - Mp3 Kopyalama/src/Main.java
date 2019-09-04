import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

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
		
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				kopyala("no2.mp3");
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				kopyala("no3.mp3");
			}
		});
		
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				kopyala("no4.mp3");;
			}
		});
		
		long baslangic = System.currentTimeMillis();
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			
			thread1.join();
			thread2.join();
			thread3.join();
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		long bitis = System.currentTimeMillis();
		
		System.out.println("3 dosyanın kopyalanması şu kadar sürdü : " + ((bitis - baslangic)/ 1000) + "saniye");
	}
}
