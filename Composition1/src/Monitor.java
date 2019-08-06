
public class Monitor {

	private String model;
	private String uretici;
	private String boyut;
	private Resolution resolution;
	
	public Monitor(String model, String uretici, String boyut, Resolution resolution) {
		
		this.model = model;
		this.uretici = uretici;
		this.boyut = boyut;
		this.resolution = resolution;
	}
	
	public void MonitoruKapat() {
		
		System.out.println("Monitor Kapatılıyor....");
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
	
	public void setBoyut(String boyut) {
		
		this.boyut = boyut;
	}
	
	public String getBoyut() {
		
		return this.boyut;
	}
	
	public void setResolution(Resolution resolution) {
		
		this.resolution = resolution;
	}
	
	public Resolution getResolution() {
		
		return this.resolution;
	}
}
