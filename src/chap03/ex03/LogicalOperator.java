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
		
//			비트연산자 : &   |   ^  ~  <= 0 or 1
//			논리연산자 : &&  ||  ^  !  <= true , false
			
			System.out.println("' 숏트서킷 ' =====================");
//		논리 연산자는 ' 숏트서킷 '이 발생될 수 있다. 쇼트서킷을 방지하기 위해서 비트연산자를 사용해서 방지할 수 있다.
//		앞에 있는 연산자로만 결괏값을 유추가 할 수 있는 경우 뒤에 오는 값은 처리하지 않고 결과를 돌려줌. 
//			-AND 연산에서 앞에 false가 있을 경우 쇼트서킷이 발생됨
//			-OR 연산에서 앞에 true가 있을 경우 쇼트서킷이 발생됨
			
//		쇼트 서킷이 발생되지 않는 경우 : 
//			- && 연산 앞에 true 뒤에 값을 확인 후 결과를 리턴
//			- || 연산에서 앞에 false 값이 오면 뒤에 값을 확인 후 결과 리턴
//		쇼트 서킷이 발생되는 경우 :
//			- && 연산에서 앞에 false 값이 오면 뒤에 값은 무시하고 결과를 리턴
//			- || 연산에서 앞에 true가 오면 뒤에 값을 무시하고 결과를 리턴
			
			System.out.println("&& 연산에서 쇼트서킷이 발생======");
			// && 연산에서 쇼트서킷이 발생
			int val10 = 3;
			
			System.out.println(false && ++val10 > 6); 
			// ' ++val10 > 6 '이 부분이 처리가 되면 val10값은 4가 와야하지만..쇼트서킷으로 인해 뒷부분 처리 안된다.
			System.out.println(val10); // val10 값은 3이 온다.
			
			System.out.println(true && ++val10 > 6); 
			// &&에서 앞에 true가 오면 뒤 값을 확인해야 결과를 알 수 있으므로 뒤에 있는 값 연산이 작동한다.
			System.out.println(val10); // 뒤에 있는 연산이 동작하여 val10 값은 ' 4 '가 된다.
			
			
			System.out.println("|| 연산에서 쇼트서킷이 발생======");
			//|| 연산에서 쇼트서킷이 발생
			int val11 = 3;
			System.out.println(true || ++val11 > 6); 
			// ||(or) 앞에 true일 때, 뒤에 있는 연산 수행하지 않는다.
			System.out.println(val11); // 연산 수행하지 않은 값 ' 3 '
		
			System.out.println(false || ++val11 > 6);
			System.out.println(val11); // 4
			
			
			System.out.println("쇼트서킷을 방지하는 방법==============");
//			쇼트서킷을 방지하는 방법 :
//				비트 연산자를 사용해서 쇼트서킷을 방지할 수 있다. &(AND) , |(OR) ..비트연산, 논리연산(쇼트서킷을 방지할 때 사용됨) 
			
			// AND 연산에서 쇼트서킷 방지 : &
			int val12 = 3;
			
			System.out.println(false & ++val12 > 6); 
			// 비트연산자가 논리연산할 때도 가능하다. 쇼트서킷을 방지.
			System.out.println(val12); //뒤에 연산 작동한다. ' 4 '
			
			
			// OR 연산에서 쇼트서킷 방지 : |

			int val13 = 3;
			
			System.out.println(false | ++val13 > 6); 
			
			System.out.println(val13); // 4
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
