package lab.chap04;

import java.util.Scanner;

public class Do_while_statement2 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

//★★★★★4번 문제 풀이 복습	


		int a; //스캐너로 인풋 받는 변수
		
		do {
			System.out.println("=========================================");
			System.out.println("1. 구구단 출력  || 2. 19단 출력  ||3. 1 ~100까지 3의 배수 출력");
			System.out.println("4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력");
			System.out.println("5. 프로그램 종료");
			System.out.println("=========================================");
			
			System.out.println("위의 내용을 정수로 입력하세요.>>>>>>>>>>>>");
			a = sc.nextInt();

//1번
			//구구단 코드 작성( 2중 for문
			if ( a == 1) {
				System.out.println("1. 구구단 출력 ");
				for (int val = 2; val < 10; val++) {
					for (int val1 = 1; val1 < 10; val1++) {
						System.out.printf("%d * %d = %d	", val, val1, (val*val1));
					}
					System.out.println();
				}
					
				
//2번				
				// 19단 출력 코드 작성( 2중 for문
			} else if ( a == 2) {
				System.out.println("2. 19단 출력");
				for (int i = 2; i < 20; i++) {
					for(int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d	", i, j, (i*j));
					}
					System.out.println();
				}
				
				
//3번				
				// for문, while문, do~while문
			} else if (a == 3) {
				System.out.println("3. 1 ~1000까지 3의 배수 출력");
		//for		
				System.out.println("for문 =======================");
				for (int i = 1; i < 100; i++) {
					if( i % 3 == 0) System.out.println("3의 배수(for) : " + i);
				}
		//while		
				System.out.println("while문 =======================");
				//while 방법1.
//				int val5 = 0;
//				while(val5 < 100) {
//					if(val5 % 3 == 0) {
//						System.out.println("3의 배수(while) : " + val5);
//					}
//					val5++;
//				}
				
				//while 방법2.
				int b = 3;
				while( b < 100) {
					System.out.println("3의 배수(while) : " + b);
					b += 3;  // b = b + 3;
				}
				
		//do~while		
				System.out.println("do~while문 =======================");
				//do~while 방법1.
//				int val6 = 0;
//				do {
//					if(val6 % 3 == 0) {
//						System.out.println("3의 배수(do~while) : " + val6);
//					}
//					val6++;
//				} while(val6 < 100);
				
				//do~while 방법2.
				boolean c = true;
				int d = 1;
				do {
					
					if (d % 3 ==0) System.out.println("3의 배수(do~while) : " + d);
					
					if (d == 100) c = false; // 1씩 계속 증가하는데 1000이 될 때 빠져나온다.
					d++;
				} while( c );
				
				
//4번				
//★★★★★복습				
			} else if (a ==4 ){
				//4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력
				System.out.println("10개의 정수를 공백으로 넣으세요.>>>>>>>>>>");
				int c, count = 0;  //c : 스캐너로 정수를 받는 변수, count : 짝수를 카운트하는 변수
				for (int i = 1; i <=10; i++) {
					c = sc.nextInt(); // 10번 루프돌면서 인풋값도 10번 입력받는다.
					
					if (c <= 0) { // ' 0 '이거나 ' 0보다 작은 값(음수) '은 카운트하지 않는다.
						continue;
					}
					
					if ( c % 2 == 0) { // 입력받은 값이 짝수일 때 카운트하겠다(count 변수에 할당한다)
						count++;
					}
				}
				System.out.println("입력한 10개의 정수 중 짝수는 : " + count + " 개 입니다.");
				
				
				
				

			} else if (a == 5) {
//5번				
				System.out.println("5. 프로그램 종료");
				break;
			}
			
		} while(true);
		
		
		
		sc.close();
		
		
		
		
		
		
	}

}
