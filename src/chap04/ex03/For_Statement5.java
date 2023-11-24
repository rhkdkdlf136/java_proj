package chap04.ex03;

public class For_Statement5 {

	public static void main(String[] args) {

//		반복문내에서 ' continue; ' , ' break; '  <= if조건을 넣어서 사용
//		(반복문 : for, while, do~while)
//			- ' continue; ' : 아래 코드는 실행하지 않고 증감식으로 이동 
//			- ' break; ' : 반복문을 빠져나온다.
		
		
		System.out.println("continue; =========================");
//		continue;
		for (int i = 1; i < 10; i++) {
			if ( i % 3 == 0) { // 3의 배수일 때 true
				//continue; 에서 빠져나온 아래 코드 실행하지 않고 다시 윗쪽 코드 실행.
//				System.out.println("continue : " + i);
				continue;
			}
			System.out.println("i변수의 값 : " + i);
		}
		
		
		for (int i = 1; i < 10; i++) {
			System.out.println("i변수의 값 : " + i);
			if ( i % 3 == 0) { 
				continue;
			}
			System.out.println("3,6,9의 배수에서는 출력 안됨");
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("break ==================================");
//		break;
		for (int i = 0; i < 10; i++) {
			System.out.println("i 변수값 출력 : " + i);
			
			if ( i == 7 ) break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
