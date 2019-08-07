
public class Dranza extends Beyblade{

	private String kutsalCanavar;
	
	public Dranza(String beybladeci,  int donusHizi, int saldiriGucu, String kutsalCanavar) {
		
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}
	
	public void bilgileriGoster() {
		
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
	}
	
	public void kutsalCanavarOrtayaCikar() {
		
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor...");
		System.out.println(getBeybladeci() + " ın Saldırısı : Alev Kılıcı");
	}
}
