package lab.chap05;

import java.util.Arrays;

public class Array_Definition4 {

	public static void main(String[] args) {

//		변수 : 1값만 저장. Stack : 변수명, 변수값. == . 기본자료형
//		배열 : 여러개의 값을 저장. 참조자료형. Stack에는 변수명과 참조주소가 들어있다. Heap : 값
//				-equals()  <= Heap
//				-초기값 : 정수(0), 실수(0.0), boolean(false)
		
		
		int a ; // 변수
//		System.out.println(a); // int a = 10; < '10' 등 초기값이 있어야 실행 오류 없다.
		
		
		int[] b = new int[10]; // 배열 선언, Heap 공간에는 초기값이 반드시 들어가야 한다.
		
		System.out.println(b[0]);
		
		//b배열에 값을 할당
		b[0] = 3;
		b[1] = 6;
		b[9] = 10;
		
		//배열의 각 방의 내용을 출력
		System.out.println(b[9]);
		
System.out.println("for문을 사용해서 0번방 ~ 9번방 ============================");
		//for문을 사용해서 0번방 ~ 9번방
		for (int i = 0; i < 10; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("배열 방의 개수 : " + b.length); // 배열 방의 개수
		
System.out.println("b.length ========================================");		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
System.out.println("향상된 for문 ========================");
		//Enhanced for문 : 배열 0 ~ 마지막방까지 모두 출력
		for (int k : b) {
			System.out.println(k);
		}
		
System.out.println("' Arrays.toString(b) ' ===================================");
		//' Arrays.toString '
		System.out.println(  Arrays.toString(b)  );
						//	  객체  .  메소드
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
