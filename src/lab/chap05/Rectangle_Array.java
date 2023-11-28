package lab.chap05;

import java.util.Arrays;

public class Rectangle_Array {

	public static void main(String[] args) {

//		1.선언
//		arr[3][10] : 행의 방번호( 0번 ~ 2번), 방의 개수(3) <= arr.length
//					 열의 방번호( 0 ~ 9번), 방의 개수(10) <= arr[0].length
		
//		2.배열 방에 값을 저장
//			<2중 for문을 사용해서 값을 저장 (for의 for에 if문 사용하여 각 행마다 출력 다르게>
//					0행에는 1부터 시작해서 1씩 증가
//					1행에는 3의 배수를 저장
//					2행 7의 배수와 8의 배수 저장
		
//		3.출력
//		1)2중 for문을 사용해서 출력
//		2)향상된 for문 사용해서 출력
//		3)Arrays.toString() 사용해서 출력(1차원 배열을 출력하니 행번호를 넣어서 출력)
		
		
		
		
//★★★★★복습		
		//1.배열 선언
		int[][] arr = new int[3][10];
		
		System.out.println(arr.length); //행의 개수 : 3
//		System.out.println(arr[0].length); //열의 개수 : 10
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);

		
System.out.println("이중 for문 사용해서 값을 입력 ===========================");
		//2.이중 for문 사용해서 값을 입력
		for (int i = 0; i < arr.length; i++) { //1차원 배열의 행을 반복 
//			System.out.println("행의 방번호 : " + i);
//				System.out.println("i : " + i + " , j : " + j);
			
				if ( i == 0 ) { //i행이 0행일 때, 배열 각방에 1씩 증가
					int a = 1;
					for(int j = 0; j < arr[i].length; j++) {
						arr[i][j] = a;
						a++;
//						System.out.print(arr[i][j] + "\t"); //출력 확인용
					}
					
				} else if (i == 1) { //i행이 1행일 때, 각 방에 3의 배수 저장
					int a = 3;
					for(int j = 0; j < arr[i].length; j++) {
						arr[i][j] = a;
						a+=3;
//						System.out.print(arr[i][j] + "\t");
					}
					
				} else if (i == 2) { //i행이 2행일 때, 7과 8의 배수 저장
					int a = 1;
					for(int j = 0; j < arr[i].length; a++) { // 증감식이 ' a++ ' 인 점 확인.
						if ( a % 7 == 0 || a % 8 == 0) {
							arr[i][j] = a;
							j++;
//							System.out.print(arr[i][j] + "\t");
						}
							
					}
				}
			
			
		}
		//
		System.out.println("=============================");
		for( int i = 0; i < arr.length; i++) {
			System.out.println(  Arrays.toString(arr[i])  );
		}
		
		
		//
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		//
//		for(int[] a : arr) {
//			for(int b : a) {
//				System.out.print(b+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
//		int num=1;
//		int sum=0;
//		int hap=1;
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//					
//				if(i==0) {
//					arr[0][j] = num;
//					num++;
//				}
//				if(i==1) {
//					arr[1][j] =sum;
//					
//					sum +=3;
//					
//				}
//				if(i==2 && (num%7==0 || num%8==0)) {
//						hap++;
//					arr[2][j] = hap;
//					
//							
//				}
//						
//				System.out.print(arr[i][j] + "\t");			
//				
//				
//				
//			}
//			System.out.println();
//		}
		
		
//		for (int i=0; i<2; i++) {
//			for (int j=0; j<9; j++) {
//				System.out.println(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
