import java.io.Serializable;

public class Kart implements Serializable {

	private char deger;
	private boolean tahmin = false;
	
	public Kart(char deger) {
		
		this.deger = deger;
	}
	
	public void setDeger(char deger) {
		
		this.deger = deger;
	}
	
	public char getDeger() {
		
		return this.deger;
	}
	
	public void setTahmin(boolean tahmin) {
		
		this.tahmin = tahmin;
	}
	
	public boolean isTahmin() {
		
		return this.tahmin;
	}
}
