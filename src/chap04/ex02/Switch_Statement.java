package chap04.ex02;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {

//		Switch : 기본적으로 case문 내에서 break; 
//			- default에서는 break; 없이 빠져나올 수 있다.
		
//		Switch 문 : ' break; '문을 넣어서 해당 블록을 빠져나와야함.
		int val1 =9;
		
		switch (val1) { // val1 : 점프변수. case의 값으로 점프. (정수, 문자(char), 문자열 등 올 수 있다)
		case 1 :
			System.out.println("A");
//			break;
		case 2 :
			System.out.println("B"); 
			break;
		case 3 :
			System.out.println("C");
			break;
		case 4 :
			System.out.println("D");
			break;
		default : // default엔 ' break; ' 안 넣어도 된다. case에 없는 값은 default로 점프.
			System.out.println("F");
		}
		System.out.println("============================");
		
		
//		문자 : char가 들어가 switch문
		char ch = 'a';
		
		switch (ch) {
		
		case 'a' :
			System.out.println("A 학점입니다");
			break;
		case 'b' :
			System.out.println("B 학점입니다");
			break;
		case 'c' :
			System.out.println("C 학점입니다");
			break;
		default :
			System.out.println("F 학점입니다");
		}
		System.out.println("==========================");
		
//		Scanner sc = new Scanner(System.in);
//		String abc;
//		System.out.println("요일을 입력하세요");
//		abc = sc.next();
		
		String abc = "월요일";
		
		switch (abc) {
		case "월요일" : 
			System.out.println("월요일은 자바를 공부합니다.");
			break;
		case "화요일" :
			System.out.println("화요일은 데이터베이스를 공부합니다.");
			break;
		case "수요일" :
			System.out.println("수요일은 html을 공부합니다.");
			break;
		case "목요일" :
			System.out.println("목요일은 리액트를 공부합니다.");
			break;
		case "금요일" :
			System.out.println("금요일은 JSP를 공부합니다.");
			break;
		case "토요일" :
			System.out.println("토요일은 운동을 합니다.");
			break;
		case "일요일" :
			System.out.println("일요일은 TV를 시청합니다.");
			break;
		default :
			System.out.println("잘못된 값을 입력했습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
