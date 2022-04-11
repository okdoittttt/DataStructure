// 배열에 삭제할 index를 입력받아 삭제하기. 삭제한 후 index의 값을 추가하기.
package week04;

import java.util.Iterator;
import java.util.Scanner;

public class Array {

	// 원소를 삭제하는 매소드
	public static void arrDel(int[] abc, int i) {
		int j;
		for (j = i; j < abc.length-1; j++) {
			abc[j] = abc[j+1];
		}
		abc[j] = 0;	
	}
	
	// 원소를 추가하는 메소드
	public static void arrIns(int[] abc, int i, int u) {
		int j;
		for (j = abc.length-1 ; j > i; j--) {
			abc[j] = abc[j-1];
		}
		abc[i] = u;
	}
	
	public static void main(String[] args) {
		
		// 변수 선언
		int ind, ins, inss;
		int[] def = {10, 20, 30, 40, 50};
		
		// =========== 원소 삭제 =============
		Scanner scn = new Scanner(System.in);
		System.out.print("삭제할 index 입력 : ");
		ind = scn.nextInt();
		
		// 함수 호출, 출력
		arrDel(def, ind);
		for (int j = 0; j < def.length; j++) {
			System.out.print(def[j]);
		}
		
		System.out.print("\n");
		
		// =========== 원소 추가 =============
		System.out.print("추가할 index 입력 : ");
		ins = scn.nextInt();
		
		System.out.print("추가할 값 입력 : ");
		inss = scn.nextInt();
		
		// 함수 호출, 출력
		arrIns(def, ind, inss);
		for (int j = 0; j < def.length; j++) {
			System.out.print(def[j]);
		}
	}
}
