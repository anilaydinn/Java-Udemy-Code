import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	/*
	 	HashMap Sınıfı
	 	
	 	1. Değerleri Key(Anahtar) ve Value(Değer) olarak depolar. Her key'e karşılık gelen bir tane değer bulunur.
	 	2. Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla olabilir.
	 	3. Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz. (HashSet gibi)
	 */
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(10, "Java");
		hashmap.put(30, "Python");
		hashmap.put(50, "Php");
		hashmap.put(20, "Php");
		hashmap.put(20, "Php");
		
		hashmap.put(50, "Javascript");
		
		/*System.out.println(hashmap);
		
		System.out.println(hashmap.get(50));
		System.out.println(hashmap.get(10));
		System.out.println(hashmap.get(100));
		*/
		
		for(Map.Entry<Integer, String> entry : hashmap.entrySet()) {
			
			System.out.println("Anahtar : " + entry.getKey() + "--------> Değer: " + entry.getValue() );
		}
	}
}
