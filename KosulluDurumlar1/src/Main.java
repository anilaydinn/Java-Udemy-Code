import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 	if (kosul) {
		 		Koşul sağlanınca(true) bu blok çalışır.
		 		
		 	}
		 	
		 	else {
		 		Bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır.
		 	
		 	}
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen yaşınızı girin:");
		
		int yas = scanner.nextInt();
		
		if(yas < 18) {
			
			System.out.println("Bu mekana giremezsiniz...");
		}
		else {
			
			System.out.println("Bu mekana girebilirsiniz...");
		}
	}
}
