
public abstract class Sekil {

	private String isim;
	
	public Sekil(String isim) {
		
		this.isim = isim;
	}
	
	abstract void alanHesapla();
	
	public void setIsim(String isim) {
		
		this.isim = isim;
	}
	
	public String getIsim() {
		
		return this.isim;
	}
}
