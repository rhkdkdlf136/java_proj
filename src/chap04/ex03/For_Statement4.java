package chap04.ex03;

public class For_Statement4 {

	public static void main(String[] args) {

//		이중 for문 : for내의 for문
		for (int i = 0; i < 5; i++) {
			System.out.println("바깥쪽 for문 : " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("i변수 : " + i + ", j변수의 값 : " + j);
				
			}
			System.out.println("========================");
		}
		
		
		System.out.println("=====================================");
		
		
//		이중 for문을 사용해서 구구단 출력
		System.out.println("구구단 출력 ====================");
		for (int i = 2; i < 10; i++) {
			System.out.println( i + " 단 출력>>>");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + "= " + (i*j));
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		
		for (int i = 2; i < 10; i++) { // i단
//			System.out.println( i + " 단 출력>>>>>>>>>>>>>>>>>>>>>>>>");
			for (int j = 1; j < 10; j++) { 
				System.out.printf("%d * %d = % d / " , i, j, (i*j));
//				System.out.print(i + " * " + j + "= " + (i*j) + " / ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
