package Act2;

public class QueueLink<E> implements Queue<E> {

	private Node<E> first;
	private Node<E> last;
	
	public QueueLink() {
		this.first = null;
		this.last = null;
	}
	
	
	
	@Override
	public void enqueue(E x) {
		// TODO Auto-generated method stub
		Node<E> aux = new Node<>(x);
		if(IsEmpty()) {
			this.first = aux;
		} else {
			this.last.setNext(aux);
		}
		this.last = aux;
	}

	@Override
	public E dequeue() throws ExceptionIsEmpty {
		// TODO Auto-generated method stub
		if(IsEmpty()) {
            throw new ExceptionIsEmpty("Queue is empty");

		}
		E data = first.getData();
        first = first.getNext();
        if (first == null) {
            last = null;
            }
        return data;	
    }


	@Override
	public E front() throws ExceptionIsEmpty {
		if(IsEmpty()) {
			throw new ExceptionIsEmpty("Queue is empty");
		}
		return first.getData();
	}

	@Override
	public E back() throws ExceptionIsEmpty {
		// TODO Auto-generated method stub
		if(IsEmpty()) {
			throw new ExceptionIsEmpty("Queue is emoty");
		}
		return last.getData();
	}

	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return first == null;
	}
	
	  public String toString() {
	        StringBuilder sb = new StringBuilder("Front -> ");
	        Node<E> current = first;
	        while (current != null) {
	            sb.append(current.getData()).append(" ");
	            current = current.getNext();
	        }
	        return sb.toString();
	  }


}