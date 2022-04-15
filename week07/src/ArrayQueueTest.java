
public class ArrayQueueTest {
	public static void main(String[] args) {
		
		// ArrayQueue Test
		ArrayQueue<Integer> aq = new ArrayQueue<>();
		
//		Integer date;
		
		aq.enqueue(100);
		aq.enqueue(200);
		aq.enqueue(300);
		aq.enqueue(400);
		
		aq.printAll();
		
//		data = aq.dequeue();
		aq.dequeue();
		
		aq.printAll();
		
	}
}
