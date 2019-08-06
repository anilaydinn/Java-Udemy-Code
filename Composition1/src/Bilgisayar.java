
public class Bilgisayar {

	private Monitor monitor;
	private Kasa kasa;
	private Anakart anakart;
	
	public Bilgisayar(Monitor monitor, Kasa kasa, Anakart anakart) {
		
		this.monitor = monitor;
		this.kasa = kasa;
		this.anakart = anakart;
	}
	
	public void setMonitor(Monitor monitor) {
		
		this.monitor = monitor;
	}
	
	public Monitor getMonitor() {
		
		return this.monitor;
	}
	
	public void setKasa(Kasa kasa) {
		
		this.kasa = kasa;
	}
	
	public Kasa getKasa() {
		
		return this.kasa;
	}
	
	public void setAnakart(Anakart anakart) {
		
		this.anakart = anakart;
	}
	
	public Anakart getAnakart() {
		
		return this.anakart;
	}
}
