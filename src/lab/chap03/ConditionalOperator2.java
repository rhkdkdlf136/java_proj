package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator2 {

	public static void main(String[] args) {

//		Scanner 로 "안녕" 문자열을 입력, 
//		"안녕"이라는 문자열이 입력되었을때 "안녕하세요", "안녕 못 합니다"
//			- == 을 사용하면 안된다.  ' .equals("안녕") ' . 삼항연산자로
		
		Scanner sc = new Scanner(System.in);
		
		String str; //String은 참조자료형이다(기본자료형이 아니다). 변수(str)의 값이 Heap에 저장되어있다.
		
		System.out.println("문자열를 입력하세요.>>>>");
		str = sc.next();
		
//		System.out.println( ( str == "안녕" ) ? "안녕하세요" : "안녕 못 합니다"); 
		System.out.println(  ( str.equals("안녕") ) ? "안녕하세요" : "안녕 못 합니다"  );
		//참조자료형일 때 변수의 값은 Heap 공간에 저장됨. stack에는 변수명과 Heap에 저장된 값의 번지가 저장되어있
		
		
		
		
		
		
	
	}

}
