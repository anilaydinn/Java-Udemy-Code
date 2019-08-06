
public class Anakart {

	private String model;
	private String uretici;
	private int yuva_sayisi;
	private String isletim_sistemi;
	
	public Anakart(String model, String uretici, int yuva_sayisi, String isletim_sistemi) {
		
		this.model = model;
		this.uretici = uretici;
		this.yuva_sayisi = yuva_sayisi;
		this.isletim_sistemi = isletim_sistemi;
	}
	
	public void IsletimSistemiYukle(String isletim_sistemi) {
		
		this.isletim_sistemi = isletim_sistemi;
		
		System.out.println("İşletim Sistemi Yüklendi: " + this.isletim_sistemi);
	}
	
	public void setModel(String model) {
		
		this.model = model;
	}
	
	public String getModel() {
		
		return this.model;
	}
	
	public void setUretici(String uretici) {
		
		this.uretici = uretici;
	}
	
	public String getUretici() {
		
		return this.uretici;
	}
	
	public void setYuvaSayisi(int yuva_sayisi) {
		
		this.yuva_sayisi = yuva_sayisi;
	}
	
	public int getYuvaSayisi() {
		
		return this.yuva_sayisi;
	}
	
	public void setIsletimSistemi(String isletim_sistemi) {
		
		this.isletim_sistemi = isletim_sistemi;
	}
	
	public String getIsletimSistemi() {
		
		return this.isletim_sistemi;
	}
}
