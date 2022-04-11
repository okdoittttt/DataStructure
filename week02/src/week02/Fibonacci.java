package week02;

import java.util.Scanner;

public class Fibonacci {

	
	static int count = 0;
	
	public static void main(String[] args) {

		int input = 5; // 8개 출력

		for (int i = 1; i <= input; i++) {
			System.out.println(fibo(i));

		}
		
		System.out.println("count : " + count);
	}



	public static int fibo(int n) {
		if (n <= 1)
			return n;
		else {
			count++;
            return fibo(n-2) + fibo(n-1);
            
		}
	}

}
