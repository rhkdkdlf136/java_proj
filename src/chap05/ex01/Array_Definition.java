package chap05.ex01;

public class Array_Definition {

	public static void main(String[] args) {

//		자료형 : 변수, 상수 , 배열(Array)을 정의할 때 자료형이 정의되어야 한다.
//			-기본 자료형 : Stack공간에 변수명, 값 등 저장. 값 비교( == )는 stack의 값을 비교.
//				boolean, 정수(byte, short, int, long), 실수(float, double), 문자(char)
//				stack은 초기값이 할당되지 않더라도 괜찮다. 초기값 없이 사용할때 문제가 발생.
//			-참조 자료형 : Stack공간엔 변수와 참조주소가 들어가고, Heap에 값이 들어간다.  변수명.equals() : Heap의 값 비교
//				String : 참조자료형. 문자열. 객체자료형
//				Heap에는 반드시 초기값이 할당되어야 한다.
//					-boolean : false (기본값)
//					-정수형 :  0 (기본값)
//					-실수 : 0.0 (기본값)
//				객체, 배열, 인터페이스
		
		
//		배열(Array) : 하나의 배열 변수에 여러개의 값을 넣을 수 있다.
//			- 방 번호(index) : 0번 방부터 시작
//			- 배열을 선언시 방번호가 선언되어야 한다.
//			-배열 방의 개수 확인 : 배열변수명.length()
			
		
//		변수 : 하나의 값만 넣을 수 있다.
		int a = 10; // 선언시 값 할당
		
		int b; // 선언 
		
		int c;
		c = 20;
		c = 30;
		c = 40;
		
		System.out.println(a);
//		System.out.println(b); // 오류 발생 : 기본자료형은 초기값이 할당되지 않으면 오류발생.
		System.out.println(c);
		
		
		System.out.println("※배열(Array) : 배열 변수 하나에 여러개의 값을 한꺼번에 넣을 수 있다");
//		※배열(Array) : 배열 변수 하나에 여러개의 값을 한꺼번에 넣을 수 있다 
//		1.배열 선언 :
		int[]   arr  = new int[5]; // index :  0, 1, 2, 3, 4 (총 5개 방이 들어간다)
//	   자료형[] 배열변수 = new int[index 방의 개수];
		// new : 배열의 값을 Heap에 저장
		// int[5] : 방 5개 생성
		
//		2.배열의 각 방의 값을 출력
		System.out.println("arr 배열의 0번째 방의 값을 출력 : " + arr[0]); // 값을 넣지않더라도 기본적으로 '0' 이 있다.
		System.out.println("arr 배열의 1번째 방의 값을 출력 : " + arr[1]);  
		System.out.println("arr 배열의 2번째 방의 값을 출력 : " + arr[2]);  
		System.out.println("arr 배열의 3번째 방의 값을 출력 : " + arr[3]);  
		System.out.println("arr 배열의 4번째 방의 값을 출력 : " + arr[4]);  
	
		
		System.out.println("3.배열 각 방에 값을 입력(값을 수정 후 출력)================");
//		3.배열 각 방에 값을 입력(값을 수정 후 출력)
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60; // 실행시 오류발생(런타임 오류) : ArrayIndexOutOfBoundsException
		// ArrayIndexOutOfBoundsException : 배열의 지정한 방번호를 (개수를) 넘어서 값을 넣었을때 오류 발생
		
		System.out.println("arr 배열의 0번째 방의 값을 출력 : " + arr[0]); 
		System.out.println("arr 배열의 1번째 방의 값을 출력 : " + arr[1]);  
		System.out.println("arr 배열의 2번째 방의 값을 출력 : " + arr[2]);  
		System.out.println("arr 배열의 3번째 방의 값을 출력 : " + arr[3]);  
		System.out.println("arr 배열의 4번째 방의 값을 출력 : " + arr[4]);
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
