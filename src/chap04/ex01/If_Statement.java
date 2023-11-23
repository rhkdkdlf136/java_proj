package chap04.ex01;

import java.util.Scanner;

public class If_Statement {

	public static void main(String[] args) {

//		클래스 이름 : 반드시 첫자는 영문 대문자
//		변수명 : 소문자로 시작. 카멜케이스(낙타형식) 형식으로 이름을 사용.
//		상수 : 대문자로만.
		
//			특수문자 : _(언더바) , & 만 사용가능. 
//			숫자가 처음에 오면 오류 발생. 숫자는 사용 가능
		
		
//		제어문 : 프로그램의 순서를 바꿔서 처리함. 
//			if문  		<= break; 가 내장되어있다(굳이 입력 안 해도된다.). 
//			switch문 . 	<= break; (블록을 빠져나올 때 사용함.) 
		
		
//		if (3가지 구문)
//		1. 조건이 1개 일 때 <= 삼항연산자로 수정 가능. ' (조건)? 참:거짓; '
//			if (조건) {
//	 			조건이 true 일 때 실행문;
//			} else {
//				조건이 false 일 때 실행문;
//			}
		
//		2. 조건이 여러개일 때
//			if (조건1) {
//				조건1일 때;
//			} else if(조건2) {
//				조건2일 때;
//			} else if(조건3) {
//				조건3일 때;
//			} else if(조건4) {
//				조건4일 때;
//			} else {
//				위의 모든 조건이 만족되지 않을때 작동;
//			}
		
//		3.한 라인으로 사용
//			if (조건) { 조건이 true일 때 }
//			if (조건)  조건이 true일 때;  // 중괄호 없애고 세미콜론 형식으로도 가능. 
		
		
		int a = 10;
		
		if ( a > 30 ) {
			System.out.println("참입니다."); // 조건이 참이면 실행
			
			
			System.out.println("참일 때 또 실행됩니다.");
		} else {
			System.out.println("거짓입니다."); // 조건이 거짓이면 실행
		}
		System.out.println("프로그램 종료입니다.");
		

//		조건이 여러개 일 때 : 
//			점수가 90점 이상일 때 : A 학점
//			점수가 80점 이상일 때 : B 학점
//			점수가 70점 이상일 때 : C 학점

		
//		int score; //점수입력시
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력하세요>>>");
//		score = sc.nextInt();
		int score = 90;
		
		if (score >= 90) {
			System.out.println("A 학점입니다");
		} else if (score >= 80) {
			System.out.println("B 학점입니다");
		} else if (score >= 70) {
			System.out.println("C 학점입니다");
		} else if (score >= 60) {
			System.out.println("D 학점입니다");
		} else {
			System.out.println("F 학점입니다");
		}
		
		
		System.out.println("if 조건에서 조건처리=========================");
		
		score = 90;
		// && 앞,뒤 조건 모두가 true여야 동작한다.
		if (score >= 60 && score <70) { // true && false == false
			System.out.println("D 학점입니다");
		} else if (score >= 70 && score < 80) { // true && false == false
			System.out.println("C 학점입니다");
		} else if (score >= 80 && score < 90) { // true && false == false
			System.out.println("B 학점입니다");
		} else if (score >= 90 && score <= 100) { //true && true = true
			System.out.println("A 학점입니다");
		} else {
			System.out.println("F 학점입니다");
		}
		
		
		System.out.println("========================");
//		조건이 true 일 때만 실행 : 중괄호를 넣어도 되고 생략할 수도 있다.
 		if ( 10 > 5 ) { System.out.println("참입니다."); } 
		
 		if (10 > 5 ) System.out.println("10은 5보다 큽니다"); //중괄호 생략할 수 있다
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
