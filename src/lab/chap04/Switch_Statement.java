package lab.chap04;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {

//		스캐너로 정수를 입력 받으세요.
//		1.switch문을 사용해서 출력 
//		case
//		'1' : "당신은 금메달을 획득했습니다"
//		'2' : "당신은 은메달을 획득했습니다"
//		'3' : "당신은 동메달을 획득했습니다"
//		default : "정수 1~3 중 하나의 값을 넣으세요"
		
//		2.if~else if 문을 사용해서 출력
		
		Scanner sc = new Scanner(System.in);
		
		int medal;
		
		System.out.println("정수로 1 ~ 사이의 값을 입력하세요.>>>>");
		medal = sc.nextInt();
		
		switch (medal) {
		case 1 : case 10 : case 100 :	//조건을 이런식으로 연달아 처리할 수 있다.
			System.out.println("당신은 금메달을 획득했습니다.");
			break;
		case 2 : case 20 : case 200 :
			System.out.println("당신은 은메달을 획득했습니다");
			break;
		case 3 : case 30 : case 300 :
			System.out.println("당신은 동메달을 획득했습니다.");
			break;
		default :
			System.out.println("정수 1 ~ 3 중 하나의 값을 넣으세요");
		}
		System.out.println("==================================");
		
		
//		스캐너로 정수를 입력 받으세요.
//		1.switch문을 사용해서 출력 
//		case
//		'1' : "당신은 금메달을 획득했습니다"
//		'2' : "당신은 은메달을 획득했습니다"
//		'3' : "당신은 동메달을 획득했습니다"
//		default : "정수 1~3 중 하나의 값을 넣으세요"
		
//		2.if~else if 문을 사용해서 출력
		
		int val2;
		
		System.out.println("정수를 입력하세요");
		val2 = sc.nextInt();
		
//		if ( val2 == 1 ) { 
//			System.out.println("당신은 금메달을 획득했습니다");
//		} else if ( val2 == 2 ) {
//			System.out.println("당신은 은메달을 획득했습니다");
//		} else if ( val2 == 3 ) {
//			System.out.println("당신은 동메달을 획득했습니다");
//		} else {
//			System.out.println("정수 1 ~ 3 중 하나의 값을 넣으세요");
//		}
		
		
		if ( val2 == 1 || val2 == 10 || medal == 100) { //조건을 이런식으로 연달아 처리할 수 있다.
			System.out.println("당신은 금메달을 획득했습니다");
		} else if ( val2 == 2 || val2 == 20 || val2 == 200) {
			System.out.println("당신은 은메달을 획득했습니다");
		} else if ( val2 == 3 || val2 == 30 || val2 == 300) {
			System.out.println("당신은 동메달을 획득했습니다");
		} else {
			System.out.println("정수 1 ~ 3 중 하나의 값을 넣으세요");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
