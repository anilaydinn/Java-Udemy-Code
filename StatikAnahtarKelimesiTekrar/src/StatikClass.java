
public class StatikClass {

	public static int obje_Sayisi = 0;
	private static String isim;
	
	public StatikClass(String isim) {
		
		this.isim = isim;
		obje_Sayisi++;
	}
	
	public static String getIsim() {
		
		return isim;  
	}
}
