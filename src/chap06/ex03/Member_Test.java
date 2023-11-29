package chap06.ex03;

public class Member_Test {

	public static void main(String[] args) {
		
//		같은 패키지내에서는 import 없이 클래스를 사용할 수 있다.(접근제어자가 default 이상이여야 한다)
		
//		1.객체 생성
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		
//		2.객체의 필드 접근 : DB에서 값을 불러와서 자바 객체의 필드에 값을 주입
		//입력(setter) m1.set~ ( Member클래스에서 getter,setter는 public로 지정되어있다
		m1.setIdx(1);
		m1.setId("ID001");
		m1.setPw("1111");
		m1.setPhone("010-1111-1111");
		m1.setName("홍길동");
		m1.setYear(1998);
		m1.setMonth(8);
		m1.setDay(22);
		m1.setAddr("서울");
		
		//(alt + shigt +a : 전체 수정)
		m2.setIdx(2);
		m2.setId("ID002");
		m2.setPw("2222");
		m2.setPhone("010-2222-2222");
		m2.setName("길길동");
		m2.setYear(1998);
		m2.setMonth(10);
		m2.setDay(11);
		m2.setAddr("부산");
		
		m3.setIdx(3);
		m3.setId("ID003");
		m3.setPw("3333");
		m3.setPhone("010-3333-3333");
		m3.setName("김길동");
		m3.setYear(1977);
		m3.setMonth(9);
		m3.setDay(25);
		m3.setAddr("대전");
		
		m4.setIdx(4);
		m4.setId("ID004");
		m4.setPw("4444");
		m4.setPhone("010-4444-4444");
		m4.setName("박길동");
		m4.setYear(1966);
		m4.setMonth(7);
		m4.setDay(15);
		m4.setAddr("인천");
		
		
//		3.필드의 값을 출력(getter)
		System.out.println( m1.getIdx() );
		System.out.println( m1.getId() );
		System.out.println( m1.getPw() );
		System.out.println( m1.getPhone() );
		System.out.println( m1.getName() );
		System.out.println( m1.getYear() );
		System.out.println( m1.getMonth() );
		System.out.println( m1.getDay() );
		System.out.println( m1.getAddr() );
		

//		4.객체 자체(' m1 ')를 출력시 '객체의 Heap의 주소'가 출력된다
		System.out.println( m1 ); //chap06.ex03.Member@5e91993f => toString메소드가 overriding되어 있어서 주소가 아닌 값이 출력됨
								//	클래스명 . 패키지명 @Heap의주소
		System.out.println( m2 ); //chap06.ex03.Member@1c4af82c
		System.out.println( m3 ); //chap06.ex03.Member@379619aa
		System.out.println( m4 ); //chap06.ex03.Member@cac736f
		
		
		System.out.println("5.객체를 배열에 저장=================================================");
//		5.객체를 배열에 저장 ( => 주로 컬렉션(ArrayList) 사용하여 저장)
		Member[] arr = new Member[10];
//(참조)멤버객체를 1차원배열 arr에 담는다. = new 방 10개(0~9번)
		arr[0] = m1; //m1 : Member [idx=1, id=ID001, pw=1111, name=홍길동, year=1998, month=8, day=22, phone=010-1111-1111, addr=서울]
		arr[1] = m2; //Member [idx=1, id=ID001, pw=1111, name=홍길동, year=1998, month=8, day=22, phone=010-1111-1111, addr=서울]
		arr[2] = m3; //Member [idx=3, id=ID003, pw=3333, name=김길동, year=1977, month=9, day=25, phone=010-3333-3333, addr=대전]
		arr[3] = m4; //Member [idx=4, id=ID004, pw=4444, name=박길동, year=1966, month=7, day=15, phone=010-4444-4444, addr=인천]
		
		System.out.println("6.배열의 정보를 끄집어 내서 출력=================================================");
//		6.배열의 정보를 끄집어 내서 출력
		for (int i =0; i < arr.length; i++) {
			Member mem1 = arr[i];
			//객체를 끄집어내서 멤버타입 mem1 넣는다
			System.out.println(mem1); //toString이 오버라이딩 된 객체를 출력
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
