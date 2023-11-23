package chap03.ex04;

public class RelationOperator {

	public static void main(String[] args) {
		System.out.println("크기비교 연산자 / 등가비교 연산자 ======================");
//		비교 연산자 : 결과를 true, false를 리턴(되돌려준다).
//			-크기비교 연산자 : > , < , >= , <=
//			-등가비교 연산자 : == (같으면 true, 다르면 false) , != (다르면 true, 같으면 false)
		
		System.out.println("1.크기비교 연산자 / 등가비교 연산자 ==============");
//		1.크기비교 연산자 / 등가비교 연산자
		System.out.println( 5 > 2 ); //true
		System.out.println( 5 < 2 ); //false
		System.out.println( 5 >= 2 ); //true
		System.out.println( 5 <= 2 ); //false
		
		System.out.println( 5 == 2 ); //false
		System.out.println( 5 != 2 ); //true
		System.out.println("==================================");
		
		
		System.out.println("2.참조자료형일 때 등가비교 연산자 사용 ===================");
		char a = 'a';
		char b = 'a';
		System.out.println( a == b ); //true. stack에 저장된 a라는 값과 b라는 값을 비교.
		System.out.println( a != b ); //false
		System.out.println("==========");
//		2.참조자료형일 때 등가비교 연산자 사용
//			- 객체변수명(str1) : stack 메모리영역에 저장됨. str1은 값이 저장된 heap의 주소를 가지고 있음.
//			- 객체의 값은 Heap 메모리영역에 저장됨.
		String str1 = new String("안녕"); // str1 = 객체
		String str2 = new String("안녕");
		System.out.println( str1 == str2 ); // ==은 stack의 변수 값을 비교.
		// stack에 str1(안녕이라는 값의 'heap의 주소값')이 저장되고, 안녕이라는 값은 heap메모리에 저장된다. 
		System.out.println( str1 != str2 );

		
		System.out.println("참조자료형일 때 Heap영역의 값을 비교할 때 ============================");
//		참조자료형일 때 Heap영역의 값을 비교할 때 : ' .equals() '메소드를 사용해서 값을 비교.
		System.out.println( str1.equals(str2) ); //true
		
		
		System.out.println("String 은 특수한 기능들이 많이 적용되어 있음 ============================");
//		String 은 특수한 기능들이 많이 적용되어 있음
		String str3 = "오늘"; // vs ' String str3 = new String("오늘"); '에서 new 일 때랑 비교하기.
		String str4 = "오늘";
		System.out.println( str3 == str4 ); // ==는 stack에 저장된 변수의 값을 비교.
		System.out.println( str3.equals(str4)); // Heap에 저장된 값을 비교
		
		
		
		
		
		
		
		
		
		
	}

}
