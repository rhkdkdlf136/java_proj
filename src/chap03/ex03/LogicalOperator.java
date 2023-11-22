package chap03.ex03;

public class LogicalOperator {

	public static void main(String[] args) {
//		논리 연산자 : 결과값으로 true, false 를 리턴한다(돌려준다). (★중요)
//			- &&(AND) , ||(OR) , ^(XOR) , !(NOT)
		
		
//		&& (AND) : 모두 true일 때 true.
//			true && true = true
//			true && false = false
//			false && true = false
//			false && false = false
		
		System.out.println("&& 연산 =====================");
//		&& 연산
		System.out.println( true && true ); //true
		System.out.println( true && false ); //false
		System.out.println( false && true ); //false
		System.out.println( false && false ); //false
		
		
		System.out.println("||(OR) =====================");
//		||(OR) : 하나라도 true이면 true.
//			true || true = true
//			true || false = true
//			false || true = true
//			false || false = false
		System.out.println( true || true ); //true
		System.out.println( true || false ); //true
		System.out.println( false || true ); //true
		System.out.println( false || false ); //false
		
		
		System.out.println("^(XOR) ===================");
//		^(XOR) : 앞 뒤 값이 같을 때 false, 앞 뒤 값이 다를 때 true
	//		true ^ true = false
	//		true ^ false = true
	//		false ^ true = true
	//		false ^ false = false		
			System.out.println( true ^ true ); //false
			System.out.println( true ^ false ); //true
			System.out.println( false ^ true ); //true
			System.out.println( false ^ false ); //false
		
		
			System.out.println("!(NOT) ============");
//			!(NOT) : true일 때 false, false일 때 true
//				~true = false
//				~false = true
			System.out.println( !true ); //false
			System.out.println( !false ); //true
		
//		논리 연산자는 ' 숏트서킷 '이 발생될 수 있다. 쇼트서킷을 방지하기 위해서 비트연산자를 사용해서 방지할 수 있다.
//		앞에 있는 연산자로만 결괏값을 유추가 할 수 있는 경우 뒤에 오는 값은 처리하지않고 결과를 돌려줌 
//			-AND 연산에서 앞에 false가 있을 경우 쇼트서킷이 발생됨
//			-OR 연산에서 앞에 true가 있을 경우 쇼트서킷이 발생됨
			
		
		
		
		
		

	}

}
