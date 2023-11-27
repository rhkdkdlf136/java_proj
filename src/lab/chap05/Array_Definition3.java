package lab.chap05;

import java.util.Scanner;

public class Array_Definition3 {

	public static void main(String[] args) {

//		1. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정. 7의 배수와 8의 배수를 저장 후 출력
//		2. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정. 1씩 증가하는데 4의 배수는 빼고 저장 후 출력
//		3. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정. 3의 배수는 저장하고 6의 배수는 빼고 저장 후 출력
//		1,2,3번 do~while문으로 입력 처리 출력
		
//		배열, 제어문(for, do~while, 연산자(||, !=(같지 않을 때 true), ==(같다) )
		
		
//		1. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정. 7의 배수와 8의 배수를 저장 후 출력
		//1.스캐너 선언
		Scanner sc = new Scanner(System.in); //콘솔로 값을 인풋
		
		//내부 블록에서 사용할 변수 선언
		//배열 변수, 스캐너로 선택하는 변수, 배열의 방의 크기를 스캐너로 받는 변수
		
		
//		int[] arr1 = new int[50]; //선언과 동시에 방의 크기 지정
		
		int[] arr; //배열변수만 선언
//		arr = new int[50]; //배열의 방의 크기를 나중에 선언
		
		
		int n; //출력을 선택하는 변수 : scanner로 콘솔로 인풋 받을 변수. 1번,2번,3번 등
		int idx; //배열의 방크기를 지정하는 변수. 

		
		do {
			System.out.println("스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정. ==============================");
			System.out.println(" 1 : 7의 배수와 8의 배수를 저장 후 출력");
			System.out.println(" 2 : 1씩 증가하는데 4의 배수는 빼고 저장 후 출력");
			System.out.println(" 3 : 3의 배수는 저장하고 6의 배수는 빼고 저장 후 출력");
			System.out.println(" 4 : 프로그램 종료");
			System.out.println("==================================================");
			System.out.println("위의 내용을 선택하세요.>>>>>>>>>>>>>>>>>>");
			
			n = sc.nextInt();
			
// 1 : 7의 배수와 8의 배수를 저장 후 출력			
//★★★★★복습			
			if ( n == 1) {
				System.out.println("1. 7의 배수와 8의 배수를 저장 후 출력");
				System.out.println("방의 크기를 정수값으로 입력하세요.>>>>>>>>>>>>>>");
				idx = sc.nextInt();
				
				arr = new int[idx];
						
				System.out.println("입력된 배열방의 크기는 : " + arr.length); //스캐너로 입력받아서 방크기 지정.
				
				int a = 1; //방에 값을 넣는 변수. 각 배열방에 7의 배수와 8의 배수를 입력
				for (int i = 0;  ; a++) { //조건식이 공백이면 항상 true라 무한루프. i는 방번호
						//무한루프 돌면서 ' a '가 증가한다.(a변수는 7의 배수나 8의 배수일 때 그 방 번호에 들어갈 '값'이다. )
					
					if ( i == idx) { break; } //방번호(i, 7의 배수와 8의 배수가 들어간 방)와 방크기가 같을 때 빠져나온다.
					
					if ( a % 7 == 0 || a % 8 == 0) { //a변수는 7의 배수나 8의 배수일 때 그 방 번호에 들어갈 '값'이다.
						arr[i] = a;
						i++; //방번호는 7의 배수와 8의 배수일 때 방번호(i)가 증가한다.
					}
					
				}
				//각 배열의 방에 내용을 출력:
				for (int i = 0; i < arr.length; i++) {
					System.out.println("방번호 : " + i + " , 값 : " + arr[i]);
				}
				
				
			} else if (n == 2) {
//2 : 1씩 증가하는데 4의 배수는 빼고 저장 후 출력			
	
				System.out.println("2. 1씩 증가하는데 4의 배수는 빼고 저장 후 출력");
				System.out.println("방의 크기를 정수값으로 입력하세요.>>>>>>>>>>>>>>");
				idx = sc.nextInt();
				arr = new int[idx]; //배열 방의 크기를 스캐너로 입력 받아서 처리함.
				
				//1, 2, 3, 5, 6, 7, 8, 10, 11 .....
				//배열 방에 값 넣기 . for문을 사용.
				
				//방법1.
				int a =1;
				for (int i = 0; i < arr.length; a++) { // 주의 : i는 방번호, ' a++ '는 값 
					
					if (a % 4 == 0) continue; //a변수의 값이 4의 배수일 때 아래 내용을 실행하지 않는다.
					
					arr[i] = a;
					i++;
					
				}
				//각 방의 내용을 for문을 사용해서 출력
				for (int i = 0; i < arr.length; i++) {
					System.out.println("방번호 : " + i + " , 값 : " + arr[i]);
				}
				
				
				
				//방법2. 주석 해제 후 실행.
//				int a = 1;
//				for (int i = 0;  ;a++) {
//					
//					//if (i == idx) break;
//					if (a % 4 == 0 ) continue;
//					
//					arr[i] = a;
//					i++;
//				
//				}
//				//각 배열의 방에 내용을 출력:
//				for (int i = 0; i < arr.length; i++) {
//					System.out.println("방번호 : " + i + " , 값 : " + arr[i]);
//				}
				
				
				
			} else if (n == 3) {
// 3 : 3의 배수는 저장하고 6의 배수는 빼고 저장 후 출력
				System.out.println(" 3 : 3의 배수는 저장하고 6의 배수는 빼고 저장 후 출력");
				System.out.println("방의 크기를 정수값으로 입력하세요.>>>>>>>>>>>>>>");
				
				idx = sc.nextInt();
				arr = new int[idx]; //배열 방의 크기를 스캐너로 입력 받아서 지정
				
				int a = 1;
				
				//배열의 각 방에 값을 넣음. for문
				//3, 9, 15, 21, 27 .....
				for (int i = 0; i < arr.length  ;a++) { //' i ':방번호는 값이 들어갔을때만 방번호가 늘어야한다.
					
					if ( a % 3 == 0) { //a의 값이 3의 배수일 때
						//방법1.(주석 해제 후 실행)
//						if ( a % 6 == 0) continue;
//						arr[i] = a;
//						i++;
						
						
						//방법2.
						if ( a % 6 != 0) { //6의 배수가 아니면서 3의 배수만 출력 
						arr[i] = a;
						i++; //값이 들어갈 때 방번호 증가
						}
						
					}
					
				}
				//배열의 각 방에 값을 출력하는 for문
				for (int i = 0; i < arr.length; i++) {
					System.out.println("방번호 : " + i + " , 값 : " + arr[i]);
				}
				
				
				
			} else if (n == 4) {
				System.out.println(" 4 : 프로그램 종료");
				break;
			}
			
		} while(true);
		
		System.out.println("도달할 수 없는 코드=="); //반복문에서 빠져나와야 도달할 수 있는 코드
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
