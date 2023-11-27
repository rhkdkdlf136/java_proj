package chap05.ex04;

public class Array_Definition {

	public static void main(String[] args) {

//		배열 선언 방법 : 3가지
		
//		1.배열 선언(1)
		//배열변수 선언과 동시에 방의 크기 지정
		int[] arr1 = new int[3]; // ' 자료형[] '
		
		//선언 후 방의 크기 나중에 지정
		int[] arr2;
		arr2 = new int[3];
		
		
//		2.배열 선언(2)
		//대괄호가 변수 뒤에 올수도 있다
		int arr3[] = new int[3]; // ' 변수명[] '
	//	int[] arr3 = new int[3]; //비교
		
		int arr4[];
		arr4 = new int[3];
		
		
//		3.배열 선언(3)
		System.out.println("3.배열 선언(3) : 배열선언과 동시에 바로 '값'을 할당");
		//배열선언과 동시에 바로 '값'을 할당.( 주의 : 방크기(' [크기] ')를 지정하면 안된다 
		int[] arr5 = new int[] {10, 20, 30, 40, 50};
		                //index  0  1   2   3   4번
		System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		System.out.println(arr5[3]);
		System.out.println(arr5[4]);
		System.out.println("arr5의 배열 방의 갯수 : " + arr5.length);
		
		
		System.out.println("3.배열 선언(3) : 배열변수를 선언하고 값은 나중에 지정");
		//배열변수를 선언하고 값은 나중에 지정
		int[] arr6;
		arr6 = new int[] {100, 200, 300, 400, 500, 600, 700};
		
		System.out.println(arr6[0]);
		System.out.println(arr6[1]);
		System.out.println(arr6[2]);
		System.out.println(arr6[3]);
		System.out.println(arr6[4]);
		System.out.println(arr6[5]);
		System.out.println(arr6[6]);
		System.out.println("arr6의 배열 방의 갯수 : " + arr6.length);

		
		System.out.println("4.배열 선언(4) : 배열을 선언하며 값을 바로 할당");
//		4.배열 선언(4)
		//배열을 선언하며 값을 바로 할당. (주의 : 선언과 값할당을 분리하면 오류 발생)
		int[] arr7 = {11, 22, 33, 44, 55};
		System.out.println(arr7[0]);
		System.out.println(arr7[1]);
		System.out.println(arr7[2]);
		System.out.println(arr7[3]);
		System.out.println(arr7[4]);
		System.out.println("arr7의 배열 방의 갯수 : " + arr7.length);

		
		//주의 : 선언과 값할당을 분리하면 오류 발생
//		int[] arr8;
//		arr8 = {66, 77, 88, 99};
		
		// ' new int[] '를 넣어야한다
		int[] arr8;
		arr8 = new int[]{66, 77, 88, 99};
		
		
		
		System.out.println("============================================");
		
		String[] arr9 = {"아버님", "어머님", "형제", "동생"};
//		            index  0	   1	   2 	  3번 
		
		//출력
		for (int i = 0; i < arr9.length; i++) { // arr9.length : 방의 개수
			System.out.println(arr9[i]);
		}
//		System.out.println(arr9.length);
		
		
		System.out.println("배열방의 값을 수정 =============================");
//		배열방의 값을 수정
		arr9[0] = "BTS"; 
		arr9[1] = "걸스그룹";
		arr9[2] = "소녀시대";
		arr9[3] = "원더걸스";
		for (int i = 0; i < arr9.length; i++) { // arr9.length : 방의 개수
			System.out.println(arr9[i]);
		}
		
		
		
		
		
		
		
	}

}
