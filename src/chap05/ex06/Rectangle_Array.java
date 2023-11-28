package chap05.ex06;

import java.util.Arrays;

public class Rectangle_Array {

	public static void main(String[] args) {
		
//		다차원 배열 : 2차원 정방형 배열
		
//		1.2차원 정방형 배열 선언
		int[][] arr1 = new int[3][4]; // Heap에 값을 저장할 방을 만들어라
//		   [][]               [3][4]
//		   행,열            ' [3행][4열] ' 크기의 방을 만들어라
		
//		2.각 index(방번호)에 값을 넣음
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[0][3] = 4;
		
		arr1[1][0] = 10;
		arr1[1][1] = 20;
		arr1[1][2] = 30;
		arr1[1][3] = 40;
		
		arr1[2][0] = 100;
		arr1[2][1] = 200;
		arr1[2][2] = 300;
		arr1[2][3] = 400;
		
		//ArrayIndexOutOfBoundsException 배열의 방번호를 넘길 때 발생하는 오류
//		arr1[2][4] = 500; // 컴파일 단계의 오류 : 이클립스에서 오류를 확인
						  // 실행 단계의 오류 : 실행시에 오류가 발생 
			
System.out.println("=========================================");

		System.out.println("3.출력 : 방번호를 직접 출력================");
//		3.출력 : 방번호를 직접 출력
		System.out.println(arr1[0][0]); // 1
		System.out.println(arr1[1][0]); // 10
		System.out.println(arr1[2][3]); // 400
		
		
		System.out.println("4.출력 : for문을 사용하여 출력================");
//		4.출력 : for문을 사용하여 출력
			// arr1.length  <= 1차원 배열일때는 열의 개수를 출력
			// arr1.length  <= 2차원 배열일때는 '행'의 개수를 출력
		System.out.println("arr1.length  <= 2차원 배열일때는 행의 개수를 출력 : " + arr1.length);
		System.out.println(arr1[0].length); // [0]번째 행의 '열의 개수'를 출력
		
		System.out.println("2차원 배열은 2중 for문을 사용해서 출력===");
		//2차원 배열은 2중 for문을 사용해서 출력
		for (int i = 0; i < arr1.length; i++) { // ' arr1.length ' 행을 반복( i : 행의 방번호 )
			for (int j = 0; j < arr1[i].length; j++) { // ' arr1[i].length ' 열을 반복( j : 열의 방번호 )
				System.out.print("arr[" + i + "]" + "[" + j + "] : " +arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		
System.out.println("5.출력 : 향상된 for문으로 출력================");
//★★★★★복습
//		5.출력 : 향상된 for문으로 출력(2중 for문으로 작동)
		for (int[] a : arr1) { // [i]행 변수. 행 자체('int[] a' ;1차원 배열)를 끄집어내서 a 변수(한 행자체가 배열이다)에 넣는다
			for (int b : a) { // [j]열 변수. (a배열의)1차원 배열(각 행)안에 있는 각 방(열)에 b변수(int b')에 값을 담는다
				System.out.print(b);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		//방법 2.
		for (int[] a : arr1) {
			System.out.println(Arrays.toString(a));
		}

		
		
System.out.println("\n6.출력 : ' Arrays.toString(배열변수명) '================");
//		6.출력 : ' Arrays.toString(배열변수명) '
		System.out.println(  Arrays.toString(arr1[0])  );
		System.out.println(  Arrays.toString(arr1[1])  );
		System.out.println(  Arrays.toString(arr1[2])  );
		
		
System.out.println("\n6.출력 : for문을 사용해서 ' Arrays.toString(배열변수명) '================");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(  Arrays.toString(arr1[i])  );
		}
		
		
		
		
		
		
		
		
		
		
	}

}
