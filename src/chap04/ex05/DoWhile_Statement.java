package chap04.ex05;

public class DoWhile_Statement {

	public static void main(String[] args) {
		
//		//while문 : 조건이 true일 때 실행문이 실행된다.
//		초기값;
//		while ( 조건 ) {
//			조건이 true일 때 실행문; 	
//			증감;
//		}
		
//		==================================================
		
		
		//do ~ while문 : 조건에 상관없이 1번은 실행문이 실행됨.
//		초기값;
//		do { // <= 조건과 상관없이 무조건 실행 1번 된다.
//			실행문;
//			증감식;
//		} while( 조건 );  // 세미콜론( ; ) 주의!
//		==================================================

		
//		while
		int a = 0;
		while (a < 0) {
			System.out.println("a : " + a); // 조건이 false 이므로 작동이 안된다. ( a = 0 ) != (a < 0 )
		}
		
		
		
//		do ~ while (조건)
		int b = 0;
		do {
			System.out.println("b : " + b); // 조건과 상관없이 ' 무조건 1번 '은 반드시 출력된다.
		}while(b < 0); // 조건
		
		
//		do ~ while에서 반복 처리
		int c = 0;
		do {
			System.out.println("c : " + c);
			c++;
			
		} while(c < 100);
		
		
		System.out.println("====================================");
//		반복 횟수가 100번인 경우 while문과 do~while문의 비교 : 동일한데 do~while문에서는 무조건 1번이 실행된다는 점이 차이점
		System.out.println("while ================================");
		
		a = 0;
		while (a < 10) {
			System.out.println("a : " + a);
			a++;
		}
		
		
		System.out.println("do ~ while ===========================");
		
		a = 0;
		do {
			System.out.println("a : " + a);
			a++;
		} while(a < 10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
