package chap03.ex01;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 산술 연산자 : + , - , * , / , %(나머지만 출력)
		 증감 연산자 : ++ (1씩 증가), --(1씩 감소)  <= 변수 앞, 변수 뒤에 쓸 수 있다
		 
		 
		 */
//		1. 산술 연산자
		int a =5;
		int b =10;
		System.out.println(a + b); // 15
		System.out.println(a - b); // -5
		System.out.println(a * b); // 50
		System.out.println(a / b); // 0 (나누어서 몫만 출력)
		System.out.println(a % b); // 5 (나머지만 출력)
		System.out.println("===============================");
		
		//캐스팅해서 연산
		System.out.println("//캐스팅해서 연산");
		System.out.println( 2 + (double)3 ); // 업캐스팅되어 5.0
		System.out.println("===============================");

		
		//
		System.out.println( 8 % 5 ); //나머지만 출력
			// ' 값 % 3 = 0 ' 일 때 : 3의 배수
			// ' 값 % 5 = 0 ' 일 때 : 5의 배수
		
		System.out.println( 8 / 5 ); //몫만 출력
		System.out.println( 8 / 5.0 ); // int 8 이 double로 바뀌면서 1.6으로 출력
		System.out.println( (int)(8 / 5.0) ); // int 형으로 출력되며 몫만 출력
		System.out.println("===============================");

		
//		2. 증감 연산자 : ++ , --
		System.out.println("2. 증감 연산자 : ++ , --");
		int val1 = 3;
		System.out.println( ++val1 ); // 4 <= 값을 증가후 출력
		System.out.println( val1++ ); // 4
		System.out.println( val1 );
		System.out.println( --val1 ); // 4
		System.out.println( val1-- ); // 4
		System.out.println( val1 ); // 3
		System.out.println("===============================");

		
		int val2 = 3;
		System.out.println(val2++); //3  <= 값을 출력 후 증가
		System.out.println(val2); // 4
		System.out.println("===============================");

		int val7 = 3;
		int val8 = 4;
		int val9 = 2  +  val7--  +  ++val8; // 2+3+5=10
		
		System.out.println("val9 : " + val9);
		System.out.println("val7 : " + val7);
		System.out.println("val8 : " + val8);
		System.out.println("===============================");
		
		int val10 = 30;
		int val11 = 40;
		int val12 = 50;
		
		int val13 = 7 + --val10 + ++val11 + val12-- ;
//			        7 +    29   +    41   +   50(->49)
		System.out.println("val13 : " + val13);
		System.out.println("val10 : " + val10);
		System.out.println("val11 : " + val11);
		System.out.println("val12 : " + val12);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
