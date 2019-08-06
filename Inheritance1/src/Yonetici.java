
public class Yonetici extends Calisan{	//Subclass

	private int sorumlu_kisi; //Ekstra Özellik
	
	public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
		
		super(isim, maas, departman);
		this.sorumlu_kisi = sorumlu_kisi;
	}
	
	public void zamYap(int zam_miktari) {
		
		System.out.println("Çalışanlara " + zam_miktari + " TL zam yapıldı.");
	}
	
	public void bilgileriGoster() {
		
		super.bilgileriGoster();
		System.out.println("Sorumlu Kişi Sayısı: " + this.sorumlu_kisi);
	}
}
