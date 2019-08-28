
public class Main {

	public static void ucuncufonksiyon() {
		
		int a = 12 / 0;	
	}
	
	public static void ikincifonksiyon() {
		
		try {
			
			ucuncufonksiyon();
		}
		catch(ArithmeticException e) {
			
			System.out.println("Bir sayı 0'a bölünemez...");
		}
	}
	
	public static void birincifonksiyon() {
		
		ikincifonksiyon();
	}
	
	public static void main(String[] args) {
		
		birincifonksiyon();
	}
}
