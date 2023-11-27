package lab.chap05;

public class Array_Definition {

	public static void main(String[] args) {

//		배열 변수명 : arr
//		배열 방의 개수 : 1000개 생성(0번 ~ 999번. ' arr.length '(총 1000개)
//		배열의 각 방에 3의 배수를 저장함. (for문 사용)
//		배열의 각방의 내용을 출력. (for문 사용)
		
		
		//1.배열 변수를 선언
		int[] arr = new int[1000];
		
		String[] arr1 = new String[10]; // arr1의 각 방에 '문자열'을 저장
//		arr1[0] = 10; //arr1은 문자열을 넣을 수 있기 때문에 정수 입력시 오류 발생.
		arr1[0] = "자바";
		arr1[1] = "HTML"; 
		
		System.out.println(arr.length); // arr변수의 방의 크기(개수) 출력 : 0번~999번 총 1000개 크기 방
		
		System.out.println(arr1.length); // 크기: 10 (0번부터 ~ 9번까지)
		
		
		//2. 1000개의 방에 3의 배수를 저장함.
//		for (int i = 0, j = 3; i < arr.length; i++) { // i는 방번호 지정 변수. 0~999번 방(1씩 증가하면서)
//			arr[i] = j;
//			j += 3; // j에 3씩 증가되면서 들어간다.
//		}
		
		
		for (int i = 0, j=3 ; i < arr.length; i++) {
			arr[i] = j;
			j += 3;
			
			System.out.println(arr[i]);
		}

		//위에 처럼 바로 출력하거나 아래 for문으로 출력.
		
		//3.1000개의 각 방에 있는 값을 출
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
