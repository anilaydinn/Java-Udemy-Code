import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player>{
	
	private String isim;
	private int id;
	
	public Player(String isim, int id) {
		
		this.isim = isim;
		this.id = id;
	}
	
	public void setIsim(String isim) {
		
		this.isim = isim;
	}
	
	public String getIsim() {
		
		return this.isim;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}
	
	public int getId() {
		
		return this.id;
	}

	@Override
	public int compareTo(Player player) {
		
		if(this.id < player.id) {
			
			return -1;
		}
		else if(this.id > player.id) {
			
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Player [isim=" + isim + ", id=" + id + "]";
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		
		/*
		 	Queue Interface ve PriorityQueue Sınıfı
		 	
		 	PriorityQueue normal Queue mantığı gibi davranmaz. Elemanlar öncelik sıralarına göre yüksek öncelik kazanıp
		 	(
		 	Integerlarda en yüksek öncelik enküçük sayıda, en düşük öncelik en büyük sayıdadır.
		 	Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen stringte,
		 	en düşük öncelik alfabetik olarak sözlükte en son gelen stringtedir.
		 	)
		 	
		 	kuyrukta önlere geçer (Tıpkı Hastanedeki Acil Servisler Gibi).
		 	
		 	add veya offer89 metodları -----> Kuyruğa eleman ekler. (Önceden gördüğümüz özellikleri taşırlar.)
		 	clear() metodu -----------------> Kuyruğu temizler.
		 	contains(Object o) -------------> o objesi kuyruğun içindeyse true, değilse false döner.
		 	peek() -------------------------> Kuyruğun başındaki elemanı döner. Eğer kuyruk boşsa null referans döner.
		 	poll() -------------------------> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Eğer kuyruk boşsa null referans döner
		 	size() -------------------------> Kuyruğun içindeki eleman sayısını döner.
		 */
		
		Queue<Player> queue = new PriorityQueue<Player>();
		
		queue.offer(new Player("Murat", 5));
		queue.offer(new Player("Mehmet", 1));
		queue.offer(new Player("Oğuz", 100));
		
		while(!queue.isEmpty()) {
			
			System.out.println("Eleman Çıkarılıyor : " + queue.poll());
		}
		
		
		/*
		queue.offer(5);
		queue.offer(1);
		queue.offer(2);
		queue.offer(100);
		
		System.out.println(queue.peek());
		System.out.println(queue.contains(100  ));
		
		
		for(Integer i : queue) {
			
			System.out.println(i);
		}
		
		
		while(!queue.isEmpty()) {
			
			System.out.println("Eleman Çıkarılıyor : " + queue.poll());
		}
		*/
		
		
	}
}
