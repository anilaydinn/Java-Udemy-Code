import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 	while(döngü koşulu) {
		 		//Koşul doğru olduğu sürece çalışır.
		 	}
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz:");
		
		int sayi = scanner.nextInt();
		
		int faktoriyel = 1;
		
		while(sayi > 0) {
			
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("Faktöriyel: " + faktoriyel);
	}
}
