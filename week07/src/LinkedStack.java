
public class LinkedStack<E> implements StackInterface<E> {
	private Node<E> topNode;
	private final E ERROR = null;   // 임의의 에러 값
	
	public LinkedStack() {
		topNode = null;
	}
	// [연습문제 8번 LinkedStack 타입의 객체 a의 내용을 그대로 두고 또 다른 LinkedStack 타입의 객체 b로 복사하는 코드를 작성하시오.]
//	public void copyStack(E topNode) {
//		Node<E> copy = new Node<>(topNode);
//		for(int i=0; i<topNode; i++) {
//			copy += topNode[i];
//		}
//	}
	// [알고리즘 6-7] 구현: 스택에 원소 x 삽입하기
	public void push(E newItem) {
		topNode = new Node<>(newItem, topNode);
	}
	
	// [알고리즘 6-8] 구현: 스택에서 원소 삭제하기
	public E pop() {
		if (isEmpty( )) return ERROR;
		else {
			Node<E> temp = topNode;
			topNode = topNode.next;
			return temp.item;
		}
	}
	
	// [알고리즘 6-9] 구현: 스택 탑 원소 알려주기
	public E top() {
		if (isEmpty()) return ERROR; 
		else return topNode.item;
	}
	
	// [알고리즘 6-10] 구현: 스택이 비었는지 확인하기
	public boolean isEmpty() {
		return (topNode == null);
	}
	
	// [알고리즘 6-11] 구현: 스택 비우기
	public void popAll() {
		topNode = null;
	}
	

	//////////////////////////////////////////////
	public void printAll() {
		Node<E> t;
		System.out.print("Stack from top: ");
		for(t=topNode; t != null; t = t.next) {
			System.out.print(t.item + " ");
		}
		System.out.println();
	}
} // 코드 6-4
