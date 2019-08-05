
public class Hesap {

	private String kullanici_adi;
	private String parola;
	private int bakiye;
	
	public Hesap(String kullanici_adi, String parola, int bakiye) {
		
		this.kullanici_adi = kullanici_adi;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	
	public void setKullaniciAdi(String kullanici_adi) {
		
		this.kullanici_adi = kullanici_adi;
	}
	
	public String getKullaniciAdi() {
		
		return this.kullanici_adi;
	}
	
	public void setParola(String parola) {
		
		this.parola = parola;
	}
	
	public String getParola() {
		
		return this.parola;
	}
	
	public void setBakiye(int bakiye) {
		
		this.bakiye = bakiye;
	}
	
	public int getBakiye() {
		
		return this.bakiye;
	}
	
	public void paraYatir(int tutar) {
		
		bakiye += tutar;
		System.out.println("Yeni Bakiyeniz: " + bakiye);
	}
	
	public void paraCek(int tutar) {
		
		if((bakiye - tutar) < 0) {
			
			System.out.println("Yeterli Bakiyeniz Yok...");
		}
		else {
			
			bakiye -= tutar;
			System.out.println("Yeni Bakiyeniz: " + bakiye);
		}
	}
}
