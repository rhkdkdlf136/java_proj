package chap05.ex02;

public class Array_Definition2 {

	public static void main(String[] args) {

//		배열 : 방의 개수를 선언해야함. 방의 개수를 수정할 수 없다.
//			-배열 방에 들어갈 자료형을 선언해야 함.
		
		
		System.out.println("실수 배열 ===============================");
//		실수 배열
		double[] arr1 = new double[10]; // 방번호(index)는 0번부터 ~ 9번까지
		//1.초기값이 없는 상태에서 출력 : 실수(double) 0.0이 자동으로 들어감
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);
		System.out.println(arr1[6]);
		System.out.println(arr1[7]);
		System.out.println(arr1[8]);
		System.out.println(arr1[9]);
//		System.out.println(arr1[10]); // 런타임 오류 발생 : 실행시 오류 발생. ArrayIndexOutOfBoundsException
		
//		//2. 배열의 각 방에 값을 넣음
		arr1[0] = 10.1;
		arr1[1] = 11.1;
		arr1[2] = 12.1;
		arr1[3] = 13.1;
		arr1[4] = 14.1;
		arr1[5] = 15.1;
		arr1[6] = 16.1;
		arr1[7] = 17.1;
		arr1[8] = 18.1;
		arr1[9] = 19.1;
		
		System.out.println("3. 출력 ==============================");
		//3. 출력:
		System.out.println(arr1[0]); // arr1[0] 0번째 방에 들어가 값을 출력. arr1[방번호]

		
		System.out.println("배열의 값을 입력, 출력시 for문을 사용해서 입력하고 출력 ===============");
//		배열의 값을 입력, 출력시 for문을 사용해서 입력하고 출력
		for ( int i = 0; i < 10; i++) { // i : index 방번호를 지정
			System.out.println(arr1[i]);
		}
		
		
		System.out.println("arr1.length() : 배열 방의 개수를 출력 ====================");
//		arr1.length() : 배열 방의 개수를 출력
		System.out.println( arr1.length ); // 배열 방의 개수 '10'개 출력된다.
		
		
		for ( int i = 0; i < arr1.length; i++) { // arr1.length : 배열 방의 개수
			System.out.println(arr1[i]);
		}
		
		
		System.out.println("배열 arr2 선언 : 100개의 정수 할당 =================================================");
		//배열 arr2 선언 : 100개의 정수 할당
		int[] arr2 = new int[100]; // arr2 배열, 0~99번 방까지 100개의 정수를 넣을 수 있음
		
		
		//for문을 사용해서 배열의 각 방에 값을 입력
		for (int i = 0, j = 1; i < arr2.length; i++) { // for문을 사용해서 
//			int j = 1; // 루프 돌 때마다 초기화되어 '1'만 연속적으로 뜬다. 그래서 for문 블록에 'j=1'로 두어야 제대로 실행됨
			arr2[i] = j;
			j++;
		}
		
		//for문을 사용해서 각방의 내용을 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
//		문자열 배열
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
