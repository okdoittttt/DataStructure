package week12;

public class Fnct {
	// 팩토리얼 구현
//	public static long factorial(int n) {
//		long fct = 1;
//		for(int i=n; i>0; i--) {
//			fct *= i;
//		}
//		
//		return fct;
//	}
	
	// 팩토리얼 재귀함수 버전
	public static int factorial(int n) {
		if (n <= 1)
			return n;
		else 
			return factorial(n-1) * n;
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial(n));
	}	
}
