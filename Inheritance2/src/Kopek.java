
public class Kopek extends Hayvan{

	private int dis_sayisi;
	
	public Kopek(String isim, int kilo, int boy, int bacak_sayisi, int dis_sayisi) {
		
		super(isim, kilo, boy, bacak_sayisi);
		this.dis_sayisi = dis_sayisi;
	}
	
	public void hareketeGec(int hiz) {
		
		System.out.println("Köpek " + hiz + " ile hareket ediyor...");
	}
	
	public void kos(int hiz) {
		
		System.out.println("Köpek koşuyor....");
		hareketeGec(hiz);
	}
	
	public void setDisSayisi(int dis_sayisi) {
		
		this.dis_sayisi = dis_sayisi;
	}
	
	public int getDisSayisi() {
		
		return this.dis_sayisi;
	}
}
