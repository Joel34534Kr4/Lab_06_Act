package Act1;

public class Test {
	public static void main(String[] args) {
		try {
			Stack<Integer> piladeEnteros = new StackArray<>(5);
			piladeEnteros.push(10);
			piladeEnteros.push(20);
			piladeEnteros.push(30);
			System.out.println("Pila de enteros: " + piladeEnteros);
			System.out.println("Elemento en el tope: " + piladeEnteros.top());
			piladeEnteros.pop();
			System.out.println("Después del pop: " + piladeEnteros);
			
			
		    Stack<String> pilaCadenas = new StackArray<>(3);
            pilaCadenas.push("A");
            pilaCadenas.push("B");
            System.out.println("Pila de cadenas: " + pilaCadenas);
            pilaCadenas.pop();
            System.out.println("Después del pop: " + pilaCadenas);

		} catch(ExceptionIsEmpty e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
