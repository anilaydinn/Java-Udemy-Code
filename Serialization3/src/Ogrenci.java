import java.io.Serializable;

public class Ogrenci implements Serializable {

	private transient String isim;
	private transient int id;
	private String bolum;
	
	private static int ogrenci_sayisi = 0;
	
	public Ogrenci(String isim, int id, String bolum) {
		
		this.isim = isim;
		this.id = id;
		this.bolum = bolum;
	}

	@Override
	public String toString() {
		
		String bilgiler = "Öğrenci İsmi : " + isim + 
						  "\nÖğrenci Numarası : " + id + 
						  "\nÖğrenci Bölüm : " + bolum;
		return bilgiler;
	}

	public static int getOgrenci_sayisi() {
		return ogrenci_sayisi;
	}

	public static void setOgrenci_sayisi(int ogrenci_sayisi) {
		Ogrenci.ogrenci_sayisi = ogrenci_sayisi;
	}
	
	
}
