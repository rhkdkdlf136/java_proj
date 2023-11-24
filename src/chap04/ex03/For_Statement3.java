package chap04.ex03;

public class For_Statement3 {

	public static void main(String[] args) {

//		무한루프에서 ' break; '를 사용해서 무한루프 빠져나오기.
//		반복문에서 특정시점에 break; : if문 내에 break;를 사용함.
//			-for문 , while , do ~ while 
		
//		for문에서 break;
		for (int i = 0; i >= 0; i+=10) { // ' i = i + 10 '  <= ' i += 10 '
			System.out.println(i);
			
			if ( i == 1000) { //조건을 주어서 무한루프를 빠져나옴.
				break;
			}
	
			
		}
		System.out.println("======================");
		
		
		for (int i = 0; i >= 0; i+=10) { // ' i = i + 10 '  <= ' i += 10 '
			System.out.println(i);
			
			if ( i == 1000)
				break;
//			System.out.println("오늘"); 
			//이미 break;로 인해 빠져나옴. 이 코드는 실행할 수 없다(unreachable code)
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
