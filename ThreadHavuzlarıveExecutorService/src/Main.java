import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i = 1; i <= 5; i++) {
			
			executor.submit(new Worker(String.valueOf(i), i));
		}
		
		executor.shutdown();
		
		System.out.println("Bütün işler teslim edildi...");
		
		try {
			
			executor.awaitTermination(1, TimeUnit.DAYS);
		}
		catch(InterruptedException e) {
			
			System.out.println("Thread kesintiye uğradı...");
		}
		
		System.out.println("Bütün işler bitti...");
		
		/*
		Thread t1 = new Thread(new Worker("1", 1));
		Thread t2 = new Thread(new Worker("2", 2));
		Thread t3 = new Thread(new Worker("3", 3));
		Thread t4 = new Thread(new Worker("4", 4));
		Thread t5 = new Thread(new Worker("5", 5));
		
		System.out.println("Bütün işler teslim edildi...");
		
		t1.start();
		t2.start();
		
		try {
			
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			
			System.out.println("Thread kesintiye uğradı...");
		}
		
		t3.start();
		t4.start();
		
		try {
			
			t3.join();
			t4.join();
		}
		catch(InterruptedException e) {
			
			System.out.println("Thread kesintiye uğradı...");
		}
		
		t5.start();
		
		try {
			
			t5.join();
		}
		catch (InterruptedException e) {
			
			System.out.println("Thread kesintiye uğradı...");
		}
		
		System.out.println("Bütün işler tamamlandı...");
		*/
	}
}
