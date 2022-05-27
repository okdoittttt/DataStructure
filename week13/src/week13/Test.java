package week13;

public class Test {
	int[] A;
	public Test(int[] B) {
		A = B;
	}
	
	public void quckSort() {
		qSort(0, A.length-1);
	}
	
	public void qSort(int p, int r) {
		int q = partition(p, r);
		qSort(p, q-1);
		qSort(q+1, r);
	}
	
	public int partition(int p, int r) {
		int x = A[r];
		int i = p-1;
		int temp;
		
		for(int j=p; j<=r-1; j++) {
			if(A[j] <= x) {
				i++;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		
		temp = A[i-1];
		A[i-1] = A[r];
		A[r] = temp;
		
		return i+1;
	}
	
}
