package Act2;

public class TestAct2 {
	public static void main(String[] args) {
		Queue<Integer> cola = new QueueLink<>();
		cola.enqueue(10);
		cola.enqueue(20);
		cola.enqueue(30);
		System.out.println("Queue: "+ cola);
		try {
			System.out.println("Front: " + cola.front());
			System.out.println("Back: " + cola.back());
	        System.out.println("Dequeue: " + cola.dequeue());
	        System.out.println("Queue after dequeue: " + cola);
		} catch(ExceptionIsEmpty e) {
			e.printStackTrace();
		}
	}

}
