
public class Main {

	public static void main(String[] args) {
		
		ReentrantLockOrnegi re = new ReentrantLockOrnegi();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				re.thread1Fonksiyonu();
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				re.thread2Fonksiyonu();
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		
		re.threadOver();
	}
}
