package lab.chap04;


public class For_Statement2 {

	public static void main(String[] args) {
		
//		실습 : 2중 for문을 사용해서 1 ~ 19단까지 각 단을 옆으로 출력(printf)
//			- ' continue; ' 사용하여  ' 6단,7단,12단 ' 을 제외하고 출력
		
		
		for(int i = 1; i < 20; i++) {
			for (int j = 1; j < 10; j++) {
				
				if ( i == 6 || i == 7 || i == 12 ) {
					continue;
				}
//				if ( i == 6 || i == 7 || i == 12 ) continue;
				
				System.out.printf("%d * %d = %d   " , i, j, (i*j));
				
			}
			System.out.println();
		}

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
