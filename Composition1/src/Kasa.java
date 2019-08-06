
public class Kasa {

	private String model;
	private String uretici;
	private String malzeme;
	
	public Kasa(String model, String uretici, String malzeme) {
		
		this.model = model;
		this.uretici = uretici;
		this.malzeme = malzeme;
	}
	
	public void BilgisayariAc() {
		
		System.out.println("Bilgisayar Açılıyor....");
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
	
	public void setMalzeme(String malzeme) {
		
		this.malzeme = malzeme;
	}
	
	public String getMalzeme() {
		
		return this.malzeme;
	}
	
}
