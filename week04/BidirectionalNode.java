<<<<<<< HEAD
package week04;

public class BidirectionalNode<E> {
	public BidirectionalNode<E> prev;
 	public E item;
 	public BidirectionalNode<E> next;
 	public BidirectionalNode() {
 		prev = next = null;
 		item = null;
 	}
 	public BidirectionalNode(E newItem) {
 		prev = next = null;
 		item = newItem;
 	}
 	public BidirectionalNode(BidirectionalNode<E> prevNode, E newItem, BidirectionalNode<E> nextNode) {
 		prev = prevNode; next = nextNode;
 		item = newItem;
 	}
} // 코드 5-13
=======
package week04;

public class BidirectionalNode<E> {
	public BidirectionalNode<E> prev;
 	public E item;
 	public BidirectionalNode<E> next;
 	public BidirectionalNode() {
 		prev = next = null;
 		item = null;
 	}
 	public BidirectionalNode(E newItem) {
 		prev = next = null;
 		item = newItem;
 	}
 	public BidirectionalNode(BidirectionalNode<E> prevNode, E newItem, BidirectionalNode<E> nextNode) {
 		prev = prevNode; next = nextNode;
 		item = newItem;
 	}
} // 코드 5-13
>>>>>>> c0a03f0ef5697b93c10c2a4e9d0a49576295cd17
