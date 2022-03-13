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
		return (n==1 || n==2) ? 1:n03(n-1) + n03(n-2);
	}
	public static void n04(int n, char a, char b, char c) {
		if(n==1)
			System.out.println(a+"에 있는 원반을 "+c+"로 옮긴다");
		else {
			n04(n-1, a, c, b);
			System.out.println(a+"에 있는 원반을 "+c+"로 옮긴다");
			n04(n-1,b,a,c);
		}
	}
	public static void main(String[] args) {
		n04(3,'A','B','C');
	}
}
