
public class Araba {

	private String renk;
	private int kapilar;
	private int tekerlekler;
	private String motor;
	private String model;
	
	public void setModel(String model) {
		
		this.model = model;
	}
	
	public String getModel() {
		
		return this.model;
	}
	
	public void setRenk(String renk) {
		
		this.renk = renk;
	}
	
	public String getRenk() {
		
		return this.renk;
	}
	
	public void setKapilar(int kapilar) {
		
		if(kapilar < 0) {
			
			System.out.println("Kapı sayısı 0'dan küçük olamaz.");
		}
		else {
			
			this.kapilar = kapilar;
		}
	}
	
	public int getKapilar() {
		
		return this.kapilar;
	}
	
	public void setTekerlekler(int tekerlekler) {
		
		this.tekerlekler = tekerlekler;
	}
	
	public int getTekerlekler() {
		
		return this.tekerlekler;
	}
	
	public void setMotor(String motor) {
		
		this.motor = motor;
	}
	
	public String getMotor() {
		
		return this.motor;
	}
	
}
