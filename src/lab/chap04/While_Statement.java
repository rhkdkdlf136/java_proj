package lab.chap04;

public class While_Statement {

	public static void main(String[] args) {

//		1000부터 1까지 5씩 감소하면서 출력 : for문, while문으로 출력
		
		
		for (int i = 1000;  ; i-=5) {
			System.out.println(i);
			if(i==0) break;
		}
		
		int val = 1000;
		boolean b = true;
		while ( b ) {
			System.out.println(val);
			val-=5;
			
			if( val==0 ) b=false;
		}
		
		
		
		
		
		
		
		
		
	}

}
