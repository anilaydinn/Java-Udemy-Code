
public class Calisan {

	private String ad;
	private String soyad;
	private int id;
	
	public Calisan(String ad, String soyad, int id) {
		
		this.ad = ad;
		this.soyad = soyad;
		this.id = id;
	}
	
	public void setAd(String ad) {
		
		this.ad = ad;
	}
	
	public String getAd() {
		
		return this.ad;
	}
	
	public void setSoyAd(String soyad) {
		
		this.soyad = soyad;
	}
	
	public String getSoyAd() {
		
		return this.soyad;
	}
	
	public void setID(int id) {
		
		this.id = id;
	}
	
	public int getID() {
		
		return this.id;
	}
	
	public void bilgileriGoster() {
		
		System.out.println("Çalışan Bilgileri....");
		System.out.println("Ad : " + ad);
		System.out.println("Soyad : " + soyad);
		System.out.println("Id : " + id);
	}
}
