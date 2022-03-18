package week01;

import java.security.PublicKey;

public class DataType {
	public static int seq(int n) {
		if ( n== 1) return 1;
		else return seq(n-1) + 3;
	}
	public static void main(String[] args) {
		System.out.println("201813066 장성익");
		int v = seq(3);
		System.out.println(v);
	}
}
