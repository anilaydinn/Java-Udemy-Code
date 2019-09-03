import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	Random random = new Random();
	
	BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public void produce() {
		
		while(true) {
			
			try {
				
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				
				System.out.println("Thread kesintiye uğradı...");
			}
				
			try {
			
				Integer value = random.nextInt(100);
				queue.put(value);
				System.out.println("Producer Üretiyor : " + value);
			}
			catch(InterruptedException e) {
				
				System.out.println("Thread kesintiye uğradı...");
			}
		}
	}
	
	public void consume() {
		
		while(true) {
			
			try {
				
				Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				
				System.out.println("Thread kesintiye uğradı...");
			}
			
			try {
				
				Integer value = queue.take();
				System.out.println("Consumer Tüketiyor : " + value);
				System.out.println("Queue Size : " + queue.size());
			}
			catch (InterruptedException e) {
				
				System.out.println("Thread kesintiye uğradı...");
			}
		}
	}
}
