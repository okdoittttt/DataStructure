package week02;

public class Work01 {
	public static int count = 0;
	public static int n01(int n) {
		return (n==1) ? 0: 5*n01(n-1) +3 ;
	}
	public static int n02(int n) {
		//n번 호출
		count++;
		return (n==1) ? 1: n02(n-1) +3;
	}
	public static int n03(int n) {
		//n이 5일경우 9번 호출
		count++;
		System.out.println(n);
		return (n==1 || n==2) ? 1:n03(n-1) + n03(n-2);
	}
	public static void n04(int n, char a, char b, char c) {
		if(n>0) {
			n04(n-1, a, c, b);
			count++;
//			System.out.println(a+"에 있는 원반을 "+b+"로 옮긴다");
			n04(n-1, c, b, a);
		}
	}
	public static void main(String[] args) {
//		for(int i=1;i<5;i++) {
//			System.out.println(n01(i));
//		}
		n04(5, 'A', 'B', 'C'); 
		System.out.println(count);
	}
}
