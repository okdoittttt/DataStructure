<<<<<<< HEAD
package week04;
import java.util.Iterator;

public class LinkedListIterator implements Iterator<Node>{
	private Node current;
	public LinkedListIterator(LinkedList list) {
		current = list.getNode(-1); // 더미 헤드
	}

	public boolean hasNext() {
		return current.next != null;
	}

	public Node next() {
		return current = current.next;
	}
=======
package week04;
import java.util.Iterator;

public class LinkedListIterator implements Iterator<Node>{
	private Node current;
	public LinkedListIterator(LinkedList list) {
		current = list.getNode(-1); // 더미 헤드
	}

	public boolean hasNext() {
		return current.next != null;
	}

	public Node next() {
		return current = current.next;
	}
>>>>>>> c0a03f0ef5697b93c10c2a4e9d0a49576295cd17
}