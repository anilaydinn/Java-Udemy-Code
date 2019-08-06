
public class Main {

	public static void main(String[] args) {
		
		/*
		Abone abone = new Abone();
		
		abone.isim = "Anıl Aydın";
		abone.bakiye = 200;
		abone.sehir = "Edirne";
		
		abone.dogalgaz_kullan(200);
		*/
		
		GelismisAbone abone = new GelismisAbone("Anıl Aydın", 200, "Edirne");
		abone.bakiye_ogren();
	}
}
