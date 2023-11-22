package chap03.ex02;

import java.util.Scanner;

public class BitWiseOperator {

	public static void main(String[] args) {
//		다양한 진법 표현, 비트연산자
		
//		1.다양한 진법 표현 : 2진수, 10진수, 8진수, 16진수
		int data = 13;
		
//		정수를 2진수로 변환 : Integer.toBinaryString(정수); -> 2진수로 출력
		System.out.println(Integer.toBinaryString(data)); // 13 -> 1101(2진수)
		
//		정수를 8진수로 변환 : Integer.toOctalString(정수); ->8진수
		System.out.println(Integer.toOctalString(data)); // 13 -> 15(8진수)
		
//		정수를 16진수로 변환 : Integer.toHexString(정수); -> 16진수로 출력
		System.out.println(Integer.toHexString(data)); // 13 -> d(16진수)
		
		
//		문자열로 된 숫자를 정수 타입으로 변환 (★중요)
		System.out.println( "3 " + " 5" ); // "문자열" + "문자열" = 문자열 연결(3 5)
		
//		Integer.parseInt("숫자"); -> 정수타입으로 저장됨. ("숫자")부분(;문자열도 된 숫자)에 '정수'로된 숫자가 와야한다
		System.out.println(Integer.parseInt("3") + Integer.parseInt("5")); 
			// "문자열"로 된 ' 3 ' or ' 5' 을 정수타입으로 변형하여 연산한다. 3(정수) + 5(정수) = 8(정수)
		
//		문자열로된 실수를 실수 타입으로 변환 <= 실수 타입으로 저장
//		: Double.parseDouble("13.5); -> 실수로 변환
		System.out.println("13.5 " + " 17.77"); // 문자열이기 때문에 연결연산자로 쓰임. ' 13.5 17.77 '
		System.out.println(Double.parseDouble("13.5") + Double.parseDouble("17.77")); 
		//문자열로 된 ' 13.5 or 17.77 '가 double형으로 바뀐다(31.27).
		
		
		System.out.println("==========================================");
//		스캐너에서 숫자가 문자열로 들어왔을 때 정수로 변환, 실수로 변환 후 연산
		
		Scanner sc = new Scanner(System.in); // ctrl + shift + o : 자동으로 import 됨
		
		String kor;
		String eng;
		String avg;
		
		System.out.println("[ 국어점수(정수), 영어점수(정수), 평균(실수) ] 로 입력해주세요.>>>>>");
		
		kor = sc.next(); 
//		애초에 정수로 지정한다면=> int kor2 = sc.nextInt(); 
		eng = sc.next();
		avg = sc.next();
		
//		int hap = kor + eng;  //오류발생 : 타입이 맞지 않다.
		int hap = Integer.parseInt(kor) + Integer.parseInt(eng);
		//			문자열(String)로 받은 숫자를 정수로 변형해준다. Integer.parseInt(문자열);
		
		System.out.println("국어점수 + 영어점수 : " + hap );
		System.out.println("평균 출력 : " + Double.parseDouble(avg)); //입력한 문자열 숫자를 실수로 변형.
		
		
//		
		
		

		
		
		
		
		
		
		
	}

}
