
public abstract class Aday {

	private int turkce;
	private int matematik;
	private int edebiyat;
	private int fizik;
	
	public Aday(int turkce, int matematik, int edebiyat, int fizik) {
		
		this.turkce = turkce;
		this.matematik = matematik;
		this.edebiyat = edebiyat;
		this.fizik = fizik;
	}
	
	public void setTurkce(int turkce) {
		
		this.turkce = turkce;
	}
	
	public int getTurkce() {
		
		return this.turkce;
	}
	
	public void setMatematik(int matematik) {
		
		this.matematik = matematik;
	}
	
	public int getMatematik() {
		
		return this.matematik;
	}
	
	public void setEdebiyat(int edebiyat) {
		
		this.edebiyat = edebiyat;
	}
	
	public int getEdebiyat() {
		
		return this.edebiyat;
	}
	
	public void setFizik(int fizik) {
		
		this.fizik = fizik;
	}
	
	public int getFizik() {
		
		return this.fizik;
	}
	
	abstract int puanHesapla();
}
