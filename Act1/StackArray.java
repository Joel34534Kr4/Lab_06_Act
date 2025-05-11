package Act1;

public class StackArray<E> implements Stack<E> {
	private E[] array;
	private int tope;

	public StackArray(int n) {
		this.array = (E[]) new Object[n];
		tope = -1;
	}
	
	@Override
	public void push(E x) {
		if (isFull()) {
			throw new RuntimeException("Stack is full");
		}
		array[++tope] = x;
	}

	private boolean isFull() {
		return tope == array.length - 1;
	}

	@Override
	public E pop() throws ExceptionIsEmpty {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return array[tope--];
	}

	@Override
	public E top() throws ExceptionIsEmpty {
		if (isEmpty()) {
			throw new ExceptionIsEmpty("Stack is empty");
		}
		return array[tope];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return tope == -1;
	}
	public String toString() {
        StringBuilder sb = new StringBuilder("Top -> ");
        for(int i = tope; i >= 0; i--) {
        	sb.append(array[i]).append(" ");
        }
		return sb.toString();
		
	}

}
