package Act3;
public class PriorityQueueLinkSort<E, N extends Comparable<N>> implements PriorityQueue<E, N> {

	private class EntryNode{
		E data;
		N priority;
		
		EntryNode(E data, N priority){
			this.data = data;
			this.priority = priority;
		}
		
		public String toString() {
			return "(" + data + ", " + priority + ")";
		}
	}
    private Node<EntryNode> first;
    private Node<EntryNode> last;

    public PriorityQueueLinkSort() {
        this.first = null;
        this.last = null;
    }
	
	@Override
	public void enqueue(E x, N pr) {
		EntryNode newEntry = new EntryNode(x, pr);
		Node<EntryNode> newNode = new Node<>(newEntry);
		
		if(isEmpty()) {
			first = last = newNode;
			return;
		}
		if(pr.compareTo(first.getData().priority) > 0) {
			newNode.setNext(first);
			first = newNode;
			return;
		}
		Node<EntryNode> current = first;
		Node<EntryNode> previous = null;
		
		while (current != null && pr.compareTo(current.getData().priority) <= 0) {
			previous = current;
			current = current.getNext();
		}
		newNode.setNext(current);
		previous.setNext(newNode);
		if (current == null) {
			last = newNode;
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public E dequeue() throws ExceptionIsEmpty {
		if (isEmpty()) throw new ExceptionIsEmpty("Queue is empty");
		E result = first.getData().data;
		first = first.getNext();
		if(first == null) last = null;
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public E front() throws ExceptionIsEmpty {
		if(isEmpty()) throw new ExceptionIsEmpty("Queue is empty");
		// TODO Auto-generated method stub
		return first.getData().data;
	}

	@Override
	public E back() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Queue is empty");
		// TODO Auto-generated method stub
		return last.getData().data;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return first == null;
	}
    public String toString() {
        StringBuilder sb = new StringBuilder("PriorityQueue -> ");
        Node<EntryNode> current = first;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return sb.toString();
    }

}
