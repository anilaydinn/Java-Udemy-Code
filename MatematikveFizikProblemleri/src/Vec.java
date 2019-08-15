import java.util.Scanner;

public class Vec {

	private String isim;
	private int i;
	private int j;
	private int k;
	
	public Vec(String isim) {
		
		this.isim = isim;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(isim + " in i, j ve k değerlerini girin...");
		System.out.println("i : ");
		this.i = scanner.nextInt();
		
		System.out.println("j : ");
		this.j = scanner.nextInt();
		
		System.out.println("k : ");
		this.k = scanner.nextInt();
	}
	
	public void setIsim(String isim) {
		
		this.isim = isim;
	}
	
	public String getIsim() {
		
		return this.isim;
	}
	
	public void setI(int i ) {
		
		this.i = i;
	}
	
	public int getI() {
		
		return this.i;
	}
	
	public void setJ(int j) {
		
		this.j = j;
	}
	
	public int getJ() {
		
		return this.j;
	}
	
	public void setK(int k) {
		
		this.k = k;
	}
	
	public int getK() {
		
		return this.k;
	}
}
