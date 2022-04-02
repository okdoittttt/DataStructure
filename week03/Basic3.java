<<<<<<< HEAD
package week03;

import java.util.Scanner;

public class Basic3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String name;
		System.out.print("이름을 입력 : ");
		name = scn.next();
		if(name.equals("홍길동")) {
			System.out.printf("이름이 %s 입니다.\n",name);
		}
		else {
			System.out.printf("%s은 홍길동이 아닙니다.\n",name);
		}
		scn.close();
	}
=======
package week03;

import java.util.Scanner;

public class Basic3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String name;
		System.out.print("이름을 입력 : ");
		name = scn.next();
		if(name.equals("홍길동")) {
			System.out.printf("이름이 %s 입니다.\n",name);
		}
		else {
			System.out.printf("%s은 홍길동이 아닙니다.\n",name);
		}
		scn.close();
	}
>>>>>>> c0a03f0ef5697b93c10c2a4e9d0a49576295cd17
} 