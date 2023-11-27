package chap05.ex03;

import java.util.Arrays;

public class Array_Definition3 {

	public static void main(String[] args) {

//		배열의 값을 출력하는 방법 : 4가지
		
		// 1. 배열 변수 선언 : 정수 방 1000개. 방번호 0번~999번까지.
		int[] arr = new int[1000];
		
		// 2. 각 방에 6의 배수를 저장함.
		for (int i = 0, j = 6; i < arr.length; i++) { // i는 배열의 방번호, j는 방에 들어갈 ' 값 '.
			arr[i] = j;
			j += 6;
//			System.out.println(arr[i]);
		}
		
		
		// 3. 출력 1 : 방번호를 직접 출력
		System.out.println("3. 출력 1 : 방번호를 직접 출력 ==========================");
		System.out.println(arr[0]);
		System.out.println(arr[999]);
		
		
		// 3. 출력 2 : for문을 사용해서 출력(출력을 조정하여(증감식 등) 방번호 출력 가능)
		System.out.println("3. 출력 2 : for문을 사용해서 출력 ===========================");
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]); // 6부터 ~ 6000 (총 1000개 출력) //주석 제거 후 확인
		}
		
		
		// 3. 출력 3 : ' 향상된(Enhanced) for문 '을 사용해서 출력. 배열의 처음부터 마지막 방까지(모든 방의 내용을 출력)
		System.out.println("3. 출력 3 : ' 향상된(Enhanced) for문 '을 사용해서 출력. 배열의 처음부터 마지막 방까지(모든 방의 내용을 출력)");
		for (int k : arr) { 
		// arr 배열변수의 0번~ 마지막방까지 출력.
//			System.out.println(k); //주석 제거 후 확인
		}
		
		
		// 3. 출력 4 : ' Arrays.toString(배열변수) ' <= 배열의 모든 값을 출력
		System.out.println("3. 출력 4 : ' Arrays.toString(배열변수) ' <= 배열의 모든 값을 출력");
		System.out.println( Arrays.toString(arr) );  // import java.util.Arrays;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
