package com.anilaydin.matematik;

public class Matematik implements IMatematik {

	public void toplama(int a, int b) {
		
		System.out.println("Toplama Sonucu : " + (a + b));
	}
	
	public void cikarma(int a, int b) {
		
		System.out.println("Çıkarma Sonucu : " + (a - b));
	}
	
	public void carpma(int a, int b) {
		
		System.out.println("Çarpma Sonucu : " + (a * b));
	}
	
	public void bolme(int a, int b) {
		
		System.out.println("Bölme Sonucu : " + ((double) a / b));
	}
}
