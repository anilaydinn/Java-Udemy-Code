
public class Account {

	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	
	public Account() {
		
		System.out.println("Kendi Yazdığımız Constructor....");
	}
	
	public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
		
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
	}
	
	public void paraYatir(double miktar) {
		
		bakiye += miktar;
		
		System.out.println("Yeni Bakiye = " + bakiye);
	}
	
	public void paraCekme(double miktar) {
		
		if(miktar > 1500) {
			
			System.out.println("Bir günde 1500 tlden fazla para çekemezsiniz...");
		}
		if(bakiye - miktar < 0) {
			
			System.out.println("Yeterli bakiye yok! Bakiye = " + bakiye);
		}
		else {
			
			bakiye -= miktar;
			
			System.out.println("Yeni bakiye = " + bakiye);
		}
	}
	
	public void setHesapNo(String hesapNo) {
		
		this.hesapNo = hesapNo;
	}
	
	public String getHesapNo() {
		
		return this.hesapNo;
	}
	
	public void setBakiye(double bakiye) {
		
		this.bakiye = bakiye;
	}
	
	public double getBakiye() {
		
		return this.bakiye;
	}
	
	public void setIsim(String isim) {
		
		this.isim = isim;
	}
	
	public String getIsim() {
		
		return this.isim;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
	}
	
	public String getEmail() {
		
		return this.email;
	}
	
	public void setTelefonNo(String telefonNo) {
		
		this.telefonNo = telefonNo;
	}
	
	public String getTelefonNo() {
		
		return this.telefonNo;
	}

}
