
public class FinalTest {

	public final int obje_sayisi;
	
	private static int say = 0;
	private final String isim;
	
	public FinalTest(String isim) {
		
		this.isim = isim;
		say++;
		obje_sayisi = say;  
	}
	
	public void setSay(int say) {
		
		this.say = say;
	}
	
	public int getSay() {
		
		return this.say;
	}
	
}
