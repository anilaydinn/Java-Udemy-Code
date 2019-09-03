import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOrnegi {

	private int say = 0;
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void arttir() {
		
		for(int i = 0; i < 10000; i++) {
			
			say++;
		}
	}
	
	public void thread1Fonksiyonu() {
		
		lock.lock();
		
		System.out.println("Thread 1 Çalışıyor...");
		System.out.println("Thread 1 Uyandırılmayı Bekliyor....");
		
		try {
			
			condition.await();
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Thread 1 Uyandırıldı ve İşlemine Devam Ediyor....");
		
		arttir();
			
		lock.unlock();
			
	}
	
	public void thread2Fonksiyonu() {
		
		try {
			
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		
		lock.lock();
		
		System.out.println("Thread 2 Çalışıyor....");
				
		arttir();
		
		System.out.println("Devam etmek için bir tuşa basın...");
		scanner.nextLine();
		
		condition.signal();
	
		System.out.println("Thread 1'i Uyandırdım. Ben gidiyorum...");
		
		lock.unlock();
		
	}
	
	public void threadOver() {
		
		System.out.println("Say değişkeninin değeri : " + say);
	}
}
