package lab.chap04;

public class While_Statement {

	public static void main(String[] args) {

//		1000부터 1까지 5씩 감소하면서 출력 : for문, while문으로 출력
		
		System.out.println("for =======================================");

		
		for (int i = 1000;  ; i-=5) {
			System.out.println(i);
			if(i==0) break;
		}
		
		
		for (int i = 1000; i > 0; i-=5) {
			System.out.println("i : " + i);
		}
		
		
		System.out.println("while =======================================");
		
		int val = 1000;
		boolean b = true;
		while ( b ) {
			System.out.println(val);
			val-=5;
			
			if( val==0 ) b=false;
		}
		
		
		int i = 1000;
		while ( i > 0) {
			System.out.println("i : " + i);
			i -= 5;
		}
		
		
		
		
		
		
		
	}

}
