
class Hayvan{
	
	private String isim;
	
	public Hayvan(String isim) {
		
		this.isim = isim;
	}
	
	public void setIsim(String isim) {
		
		this.isim = isim;
	}
	
	public String getIsim() {
		
		return this.isim;
	}
	
	public String konus() {
		
		return "Hayvan konuşuyor...";
	}
	
}

class Kedi extends Hayvan{
	
	public Kedi(String isim) {
		
		super(isim);
	}
	
	public String konus() {
		
		return this.getIsim() + " miyavlıyor...";
	}
}

class Kopek extends Hayvan{
	
	public Kopek(String isim) {
		
		super(isim);
	}
	
	public String konus() {
		
		return this.getIsim() + " havlıyor...";
	}
}

class At extends Hayvan{
	
	public At(String isim) {
		
		super(isim);
	}
	
	public String konus() {
		
		return this.getIsim() + " kişniyor...";
	}
}

class Kus extends Hayvan{
	
	public Kus(String isim) {
		
		super(isim);
	}
	
	public String konus() {
		
		return this.getIsim() + " ötüyor...";
	}
}

public class Main {

	public static void konustur(Object object) {
		
		//System.out.println(object.konus());
		
		if(object instanceof Kopek) {
			
			Kopek kopek = (Kopek)object;
			System.out.println(kopek.konus());
		}
		else if(object instanceof Kedi) {
			
			Kedi kedi = (Kedi)object;
			System.out.println(kedi.konus());
		}
		else if(object instanceof At) {
			
			At at = (At)object;
			System.out.println(at.konus());
		}
		else if(object instanceof Hayvan) {
			
			Hayvan hayvan = (Hayvan)object;
			System.out.println(hayvan.konus());
		}
	}
	
	public static void main(String[] args) {
		
		//instanceof
		/*
		Kopek kopek = new Kopek("Karabaş");
		
		if(kopek instanceof Kopek) {
			
			System.out.println("Bu nesne Kopek sınıfından...");
		}
		*/
		
		Kedi kedi = new Kedi("Tekir");
		Kopek kopek = new Kopek("Karabaş");
		At at = new At("Şahbatur");
		Hayvan hayvan = new Hayvan("Limon");
		Kus kus = new Kus("Zeytin");
		
		konustur(kedi);
		konustur(kopek);
		konustur(at);
		konustur(hayvan);
		konustur(kus);
	}
}
