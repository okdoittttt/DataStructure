// 2022. 03. 11 Week02 재귀 함수 구조 예제
package week02;

// 예제 1) 등차수열을 재귀함수로 정의하기.
//======================================================================================
//public class Recursion {
//	public static int seq(int n) {
//		if(n==1)
//			return 1;
//		else
//			return seq(n-1) + 3;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=1; i<=10; i++) {
//			System.out.print(seq(i)+" ");
//		}
//
//	}
//
//}

// 예제 2번) 등차수열을 재귀함수로 정의하기.
// ======================================================================================
//public class Recursion {
//	public static void A(int n) {
//		if(n > 0) {
//			A(n-1);
//			System.out.println("  "+n);
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		A(3);
//	}
//
//}

//예제 3번) factorial 을 재귀함수로 정의하기.
//======================================================================================
public class Recursion {
	public static int fact1(int n) {
		int tmp = 1;
		for(int i=2; i<=n; i++) {
			tmp = tmp * i;
		}
		return tmp;
	}

	public static int fact2(int n) {
		if(n == 0)
			return 1;
		else
			return n * fact2(n - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact1(5));
		System.out.println(fact2(5));
	}

}
