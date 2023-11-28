package chap05.ex05;

public class Array_Definition {

	public static void main(String[] args) {

//		기본 데이터 타입(8가지) 변수명 vs 참조 데이터 타입[] 참조변수명
		
//		1.기본 데이터타입에서 대입 연산( = ) : Stack에 값을 복사
				// ' = ' : 오른쪽의 데이터를 왼쪽에 대입해라.(대입연산자)
		int val1 = 3;
		int val2 =val1; // ' = ' : Stack에 저장된 값을 대입
//			System.out.println(val2); //3
		val2 = 7;
		
		
		System.out.println(val1); // 3
		System.out.println(val2); // 7
	
		
System.out.println("=============================");
//		2.참조 데이터타입에서 대입 연산( = ) : Stack에 Heap의 주소를 복사
		int[] arr1 = new int[] {3,4,5}; // 배열선언과 동시에 값 할당
		int[] arr2 = arr1; // arr2에는 arr1의 '참조주소'가 복사
		
		System.out.println(arr1); // arr1에 저장된 stack의 Heap의 주소(' I@515f550a ')이다
		System.out.println(arr2); // I@515f550a 
		
		arr1[0] = 7;
		System.out.println(arr1[0]); // 7
		System.out.println(arr2[0]); // 7
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
