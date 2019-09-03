import java.util.Scanner;

public class WaitNotify {

	private Object lock = new Object();
	
	public void thread1Fonksiyonu() {
		
		synchronized(lock) {
			
			System.out.println("Thread 1 Çalışıyor....");
			System.out.println("Thread 1 Thread 2 nin kendisini uyandırmasını bekliyor...");
			
			try {
				
				lock.wait();
			}
			catch(InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Thread 1 Uyandı. Devam Ediyor...");
		}
	}
	
	public void thread2Fonksiyonu() {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		synchronized(lock) {
			
			System.out.println("Thread 2 Çalışıyor...");
			
			System.out.println("Devam etmek için bir tuşa basın....");
			
			scanner.nextLine();
			
			lock.notify();
			
			System.out.println("Uyandırdım abi. Ben gidiyorum Ama 2 saniye bekle");
			
			try {
				
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
