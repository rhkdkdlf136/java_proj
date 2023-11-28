package lab.chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Rectangle_Array2 {

	public static void main(String[] args) {

//		arr : 배열 변수명, 2차원 배열, [5][10](5행 10열)
//			arr[0] : 짝수만 저장
//			arr[1] : 홀수만 저장하는데 3의배수는 빼고 저장
//			arr[2] : 4, 5의 배수를 저장
//			arr[3] : 10의 배수 저장
//			arr[4] : 8단을 입력값 입력
//		for문으로 출력
//		향상된 for문
//		Arrays.toString() 으로 출력
				
		
//		Scanner sc = new Scanner(System.in);
		

		//1.배열 선언
		int[][] arr = new int[5][10];
		System.out.println(arr.length); // 행의 개수(arr은 2차원 배열) 
		System.out.println(arr[0].length); // [0]번 행의 열의 개수
		
		//2.값을 입력: 이중for문
//			-바깥쪽 for : 행을 이동
//			-안쪽 for : 열을 이동
		for (int i = 0; i < arr.length; i++) { // arr.length : 2차원 배열에서 행의 개수. i는 행의 번호.
			
			if (i == 0) { //arr[0] : 짝수만 저장
				int a = 2;
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = a;
					a += 2;
					
				}
			} else if (i == 1) { //arr[1] : 홀수만 저장하는데 3의배수는 빼고 저장
				int a = 1;
				for (int j = 0; j < arr[i].length; a += 2) {
					
					if(a % 3 == 0) continue;
					
					arr[i][j] = a;
					j++; //방 번호 증가
					
				}
				
				
				//방법2.
//				int a = 1;
//				for(int j = 0; j < arr[i].length; a++) {
//					if( a % 2 != 0) { // 홀수일 때
//						if ( a % 3 != 0) { // 3의 배수가 아닐 때
//							//홀수이면서 3의 배수가 아닐 때의 실행 블록
//							arr[i][j] = a;
//							j++;
//						}
//					}
//				}
				
				
			} else if (i == 2) { //arr[2] : 4, 5의 배수를 저장
				int a = 1;
				for (int j = 0; j < arr[i].length; a++) {
					if( a % 4 == 0 || a % 5 == 0 ) {
						arr[i][j] = a;
						j++;
					}
				}
				
			} else if (i == 3) {// arr[3] : 10의 배수 저장
				int a = 1;
				for (int j = 0; j < arr[i].length; a++) {
					if ( a % 10 == 0) {
						arr[i][j] = a;
						j++;
					}
				}
				
			} 
			
			else if (i==4) {//arr[4] : 8단을 입력값 입력
				int a = 8;
				for(int j=0; j < arr[i].length; j++) {
					arr[i][j] = a;
					a += 8;
				}
			} 
			
			//직접 정수 입력 구구단값
//			else if (i == 4) {
//				Scanner sc = new Scanner(System.in);
//				System.out.println("정수 입력:");
//				int num = sc.nextInt();
//				int n = 1;
//				for(int j=0; j < arr[i].length; n++) {
//					int multi = num * n;
//					arr[i][j] = multi;
//					j++;
//				}
//			}
			
			
			
		}
//		System.out.println( Arrays.toString(arr[0]) ); //각 행별 테스트 출력할 때
//		System.out.println( Arrays.toString(arr[1]) ); //각 행별 테스트 출력할 때
//		System.out.println( Arrays.toString(arr[2]) ); //각 행별 테스트 출력할 때
//		System.out.println( Arrays.toString(arr[3]) ); //각 행별 테스트 출력할 때
//		System.out.println( Arrays.toString(arr[4]) ); //각 행별 테스트 출력할 때
		
		
	System.out.println("for문 =====================================");
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	System.out.println("향상된 for문 =====================================");
		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + "\t");
			}
			System.out.println();
		}
		
		System.out.println("향상된 for문(방법2.) =====================================");

		//방법2.
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}

		
	System.out.println("Arrays.toString(arr[i]) =====================================");
		for (int i = 0; i < arr.length; i++) {
			System.out.println( Arrays.toString(arr[i]) );
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
