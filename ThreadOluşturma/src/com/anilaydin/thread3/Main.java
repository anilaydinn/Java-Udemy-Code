package com.anilaydin.thread3;

public class Main {

	public static void main(String[] args) {
		
		/*Thread printer1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Thread Çalışıyor...");
				
				for(int i = 1; i <= 10; i++) {
					
					try {
						
						System.out.println("Yazıyor : " + i);
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						
						System.out.println("Thread kesintiye uğradı..");
					}
				}
				System.out.println("Bitti..");
			}
		});*/
		
			new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Thread Çalışıyor...");
				
				for(int i = 1; i <= 10; i++) {
					
					try {
						
						System.out.println("Yazıyor : " + i);
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						
						System.out.println("Thread kesintiye uğradı..");
					}
				}
				System.out.println("Bitti..");
			}
		}).start();
		
		//printer1.start();
		
		System.out.println("Main Thread Çalışıyor...");
	}
}
