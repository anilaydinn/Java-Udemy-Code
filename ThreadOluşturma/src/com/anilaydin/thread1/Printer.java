package com.anilaydin.thread1;

public class Printer extends Thread {

	private String isim;
	
	public Printer(String isim) {
		
		this.isim = isim;
	}
	
	public void run() {
		
		System.out.println(isim + " Çalışıyor...");
		
		for(int i = 1; i <= 10; i++) {
			
			try {
				
				System.out.println(isim + " Yazıyor : " + i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
				System.out.println("Thread kesintiye uğradı..");
			}
		}
		
		System.out.println(isim + " işini bitirdi..");
	}
}
