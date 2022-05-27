package week13;

public class Factorial {
	/* 반복문 버전
	public static int factorial(int n) {
		
		// 반복문 사용.
		int f = 1;
		for(int i=n; i>0; i--) {
			f = f * i;
		}
		
		return f;
	}
	*/
	// 재귀함수 버전
	public static int factorial(int n) {
		if (n <= 1)
			return n;
		else {
			return factorial(n-1) * n;
		}
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial(n));
	}
}
