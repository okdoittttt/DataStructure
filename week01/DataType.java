<<<<<<< HEAD:week01/src/week01/DataType.java
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
=======
package week01;

public class DataType {
	public static void main(String[] args) {
		System.out.println("201813066 장성익");
	}
}
>>>>>>> c0a03f0ef5697b93c10c2a4e9d0a49576295cd17:week01/DataType.java
