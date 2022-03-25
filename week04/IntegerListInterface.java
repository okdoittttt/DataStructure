package week04;

public interface IntegerListInterface {
	public void add(int i, Integer x);
	public void append(Integer x);
	public Integer remove(int i);
	public boolean removeItem(Integer x);
	public Integer get(int i);
	public void set(int i, Integer x);
	public int indexOf(Integer x);
	public int len();
	public boolean isEmpty();
	public void clear();
} // 코드 5-1