
public class EsitAgirlik extends Aday{

	public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik) {
		
		super(turkce, matematik, edebiyat, fizik);
	}
	
	public int puanHesapla() {
		
		return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;
	}
}
