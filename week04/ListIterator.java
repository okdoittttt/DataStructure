<<<<<<< HEAD
package week04;

import DS.Vertex;

public interface ListIterator implements Iterator<Vertex>{
	private int index = 0;
	private int numVertices;
	private Vertex v[];
	public ListIterator() {
		LinkedList list = new LinkedList();
	}
	public boolean hasNext() {
		return index < numVertices;
	}
	public Vertex next() {
		return v[index++];
	}
}
=======
package week04;

import DS.Vertex;

public interface ListIterator implements Iterator<Vertex>{
	private int index = 0;
	private int numVertices;
	private Vertex v[];
	public ListIterator() {
		LinkedList list = new LinkedList();
	}
	public boolean hasNext() {
		return index < numVertices;
	}
	public Vertex next() {
		return v[index++];
	}
}
>>>>>>> c0a03f0ef5697b93c10c2a4e9d0a49576295cd17
