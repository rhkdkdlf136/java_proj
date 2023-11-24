package lab.chap04;

import java.util.Scanner;

public class For_Statement {

	public static void main(String[] args) {

//		for문
//		구구단 중 7단만 출력 : for문을 사용해서
//		7 * 1 = 7
//		7 * 2 = 14
//		7 * 3 = 21
//		7 * 4 = 28
//		7 * 5 = 35
//		~
		
		//방법1.
		for (int i = 1; i < 10; i++) {
			int val = 7;
			int result = val * i;
			//출력방법은 여러가지가 있다(정답은 없다).
			System.out.printf("%d * %d = %d\n", val, i, result);
//			System.out.println("7 * " + i + " = " + (i*7)); 
		}
		
		
		System.out.println("==========================");
		//방법2.
		for ( int i = 1, j = 7; i < 10; i++) {
			System.out.println(j + " * " + i + " = " + (i*j));
		}
		System.out.println("==========================");

		
		//방법3.
		for (int i = 1, j = 7; i < 10; i++) {
			System.out.printf("%d * %d = %d\n" , j, i, (j*i));
		}
		
		
		
		
		//숫자입력시 구구단
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.>>>");
		int num;
		num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			int result = num * i;
			System.out.printf(" %d * %d = %d\n", num, i, result);
		}
		
		
	
		
		
		
	}

}
