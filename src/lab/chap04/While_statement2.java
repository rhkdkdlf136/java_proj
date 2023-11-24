package lab.chap04;

public class While_statement2 {

	public static void main(String[] args) {
		
//		반복문에서 무한루프
		
		int a = 1;
		while(a > 0) {
			System.out.println("무한루프 발동" + a);
			
			if (a == 1000) break;
			a++;
		}
		
		
		//무한루프
		int c = 0;
		boolean b = true;
		while ( b ) {
			
			System.out.println(c);
			c++;
			
			if (c == 100) b=false; //break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
