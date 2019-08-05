
public class Main {

	public static void skorhesapla(String isim, int puan) {
		
		System.out.println(isim + " adlı oyuncunun " + puan + " puanı var");
	}
	
	public static void skorhesapla(int puan) {
		
		System.out.println("İsimsiz oyuncunun " + puan + " puanı var");
	}
	
	public static void skorhesapla(String isim) {
		
		System.out.println(isim + " adlı oyuncunun hiç puanı yok");
	}
	
	/*
	public static void toplama(String a, String b) {
		
		System.out.println(a + " " + b);
	}
	
	public static void toplama(int a, int b) {
		
		System.out.println("Toplamları = " + (a + b));
	}
	
	public static void toplama(int a, int b, int c) {
		
		System.out.println("Toplamları = " + (a + b + c));
	}
	*/
	
	public static void main(String[] args) {
		
		/*
		toplama(3, 4, 5);
		toplama(2, 5);
		toplama("Anıl", "Aydın");
		*/
		
		skorhesapla("Anıl", 1000);
		skorhesapla("Murat");
		skorhesapla(1500);
		
	}
}
