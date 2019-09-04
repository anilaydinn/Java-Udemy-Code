import java.util.concurrent.Semaphore;

public class SemaphoreOrnegi {

	private Semaphore sem = new Semaphore(4);
	
	public void threadFonksiyonu(int id) {
		
		try {
			
			sem.acquire();
			
			System.out.println("Thread Başlıyor... ID : " + id);
			
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Thread Çıkıyor... ID : " + id);
		
		sem.release();
	}
}
