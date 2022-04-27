package list;

public class LinkedList implements ListInterface{
	
	private Node<E> head;
	private int numItems;
	
	public LinkedList() {
		head = getNode(null, null);
		numItems = 0;
	}
	
	// add
	public void add(int index, E item) {
		if(index >= 0 && index <= numItems)
		{
			Node<E> preNode = getNode(index-1);
			Node<E> newNode = new Node(item, preNode.next);
			preNode.next = newNode;
			numItems++;
		}
		
	}
	
	public void addItem(E item) {
		Node<E> preNode = head;
		while(preNode.next != null)
		{
			preNode = preNode.next;
		}
		Node<E> newNode = new Node<>(item, null);
		preNode.next = newNode;
		numItems++;
	}
	
	// remove
	public E remove(int index) {
		if(index >= 0 && index <= numItems)
		{
			Node<E> preNode = getNode(index-1);
			Node<E> currNode = preNode.next;
			preNode.next = currNode.next;
			numItems--;
		}
	}
	
	public Node<E> getNode(int index) {
		if(index > 0 && index <= numItems -1)
		{
			Node<E> currNode = head;
			for(int i=0; i<=index; i++)
			{
				currNode = currNode.next;
			}
			return currNode;
		}
		else return null;
	}
}
