package test;

import Act2.*;
public class Test {
	public static void main(String[] args) {
		try {
			Queue<String> coladeNombres = new QueueLink<>();
			coladeNombres.enqueue("Alice");
			coladeNombres.enqueue("Bob");
			coladeNombres.enqueue("Charlie");
			System.out.println("Cola: " + coladeNombres);
			System.out.println("Frente: " + coladeNombres.front());
			System.out.println("Cola: " + coladeNombres.back());
			coladeNombres.dequeue();
			System.out.println("Después del dequeue: " + coladeNombres);
			
			Queue<Integer> coladeNumeros = new QueueLink<>();
			coladeNumeros.enqueue(1);
			coladeNumeros.enqueue(2);
			System.out.println("Cola de enteros: " + coladeNumeros);
			
		}catch(ExceptionIsEmpty e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
