
public class Main {

	public static void main(String[] args) {
		
		String[] array = {"Elma", "Armmut", "Kiraz"};
		int[] array2 = {1, 2, 3, 4, 5, 6, 7};
		Deneme[] array3 = {new Deneme("Anıl"), new Deneme("Aydın"), new Deneme("Ozan")};
		
		for(String a : array) {
			
			System.out.println(a);
		}
		
		for(int i : array2) {
			
			System.out.println(i);
		}
		
		for(Deneme d : array3) {
			
			d.yaz();
		}
	}
}
