package chap10.ex01;

//Human(부모),Professor(자식),Student(자식),Worker(자식) 클래스를 활용할 메인

public class Inheritance01 {

	public static void main(String[] args) {

//		※상속(inheritance) : OOP(객체지향프로그램)의 특징이다.
//			-자바는 하나의 부모클래스만 상속할 수 있다. 다중상속을 지원하지 않는다.
//			-중복된 코드를 방지할 수 있다.
//			-OOP의 꽃이다(그정도로 중요하다)
//			-부모클래스의 '필드,메소드,이너클래스' 등 그대로 자식클래스로 상속된다.(클래스내부의 생성자는 상속되지 않는다)
//			-자식클래스를 생성하면 자식클래스 생성자 내부에 ' super( ) '가 생략되어있다. 
//				' super() ' 메소드 : 부모클래스의 생성자를 호출 
//			-자식클래스를 생성하면 부모클래스가 먼저 만들어지고 자식클래스가 생성된다.
//			- ' 자식클래스명 extends 부모클래스명 ' <= 상속관계 설정 
		
		
//		1.Student 객체 생성 :
		Student s1 = new Student(); 
		//타입  객체       기본생성자
		
//		(Student와 부모Human 클래스 활용)
		//부모클래스(Human)에서 정의한 필드와 메소드
		s1.name = "홍길동"; //부모클래스 필드 활용
		s1.age = 30;
		
		s1.eat(); //부모클래스 메소드 활용
		s1.sleep();

		//Student 클래스의 필드와 메소드
		s1.studentID = 1111; // Student 클래스 필드 활용
		
		s1.goToSchool(); // Student클래스 메소드 활용
		
		
		s1.stuInfo(); //Student 메소드 
		
		
		System.out.println("Professor ====================");
//		2.Professor
		Professor p1 = new Professor();
		
		//부모의 필드와 메소드
		p1.name = "김교수님"; //부모클래스 필드 활용
		p1.age = 50;
		
		p1.eat(); //부모클래스 메소드 활용
		p1.sleep();
		
		//자식의 필드와 메소드
		p1.professorId = 2222; //자신 메소드 활용
		p1.teach();
		
		
		System.out.println("3.Worker ====================");
//		3.Worker
		Worker w1 = new Worker();
		
		w1.name = "김워커";
		w1.age = 30;
		
		w1.eat();
		w1.sleep();
		
		//자식
		w1.workerId = 3333;
		w1.goToWork();
		
		
		System.out.println("super  vs  super()  =====================================");
//		super  vs  super()
		
//		this 키워드 : 자기자신의 객체.  ' this.필드명 '  , ' this.메소드명 '
//		this() 메소드 : 생성자 실행 블록(생성자내부)에서 사용됨. 생성자 블록 내부 첫 라인에 와야한다. 다른 생성자를 호출할 때 쓰인다.
					  
		
//		super 키워드 : 부모의 필드 메소드 호출.  ' super.필드명 ' , ' super.메소드명 '
//		super() 메소드 : 생성자 실행블록에서만 사용됨. 생성자 블록 내부 첫라인에 와야한다. 부모클래스의 생성자를 호출할 때 쓰인다.
//					    자식클래스 생성자 내부에는 실행블록 첫라인에 ' super() '메소드가 생략되어 있다.
//						자식클래스를 생성하면 super() 에 의해서 부모클래스가 먼저 만들어지고 난 후 자식이 만들어진다.
		
		
		Student s2 = new Student(); // 기본생성자 호출(인풋없는)
		
		System.out.println();
		System.out.println("Student s3 = new Student(9999); ===========================");
		//Student클래스의 인풋(매개변수) 1개인 생성자 호출
		Student s3 = new Student(9999); // Student의 'Student(int studentID)' 메소드
		//Object가 생성 -> Human 생성 -> Student 생성
		//1.Student(9999) 생서자 호출하면, Human의 ' super("김똘똘", 20); '을 호출 이후에 Student의 'this.studentID = studentID; ,this.stuName = super.name;, super.eat();'가 실행된다.
		//객체 생성자체가 출력구문이 있으면 바로 출력이 된다. 생성자체에 출력구문 없이 값을 초기화(입력)되기도 하지만 출력문이 있다면 객체생성블록에서의 객체생성과 동시에 출력문도 같이 실행된다.
		
		System.out.println();
		System.out.println(s3.name);
		System.out.println(s3.age);
		
		System.out.println(s3.stuName);
		

		
		System.out.println("※Type Casting ==================================================="); 
//		※Type Casting :
//			Up Casting : 자동 적용될 수 있다. 자식타입에서 부모타입으로. 부모의 필드와 메소드만 사용 가능
//			Down Casting: 부모에서 자식으로. 명시가 필요. 부모와 자식의 필드와 메소드를 모두 사용 가능

		
//		자식 객체를 생성해서 부모타입으로 지정함 : 부모의 필드와 메소드만 사용가능
		//호출 : 1.Chird 호출 -> 2.Professor 호출 -> 3.Human 호출
		//생성 : 4.Human 생성 -> 5.Professor 생성 -> 6.Chird 생성
		Human ch01 = new Chird(); // ch01 객체 : Human,Professor,Chird클래스를 내포하고 있지만, 타입자체가 Human이니 Human클래스의 필드와 메소드만 사용할 수 있다
		//Human 타입(Type) : Human의 필드와 메소드만 사용가능 함.
		//new 'chird'를 객체화함
		
		//Human의 필드와 메소드만 사용가능 (Human 타입이라..  'Human' ch01 = new Chird(); 
		ch01.name = "홍길동";
		ch01.eat();
		
		
		
//		다운캐스팅 : Human, Professor의 필드와 메소드를 사용 가능
		Professor pp1 = (Professor) ch01; 
	  // Type(타입)               객체화
		//ch01은 Human타입으로 되어 있는데 다운캐스팅을 통해 ' (Professor) '타입으로 변경했다.
		
		//Human
		pp1.age = 10;
		//Professor
		pp1.professorId = 30;
		
		
		System.out.println();
		//다시 다운캐스팅하면... Human, Professor, Chird의 필드와 메소드 사용가능.
		Chird ch05 = (Chird) pp1;
		           //' (Chird) ' 명시해서 다운캐스팅
		
		//Human
		ch05.name = "이순신";
		//Professor
		ch05.professorId = 333;
		//Chird
		ch05.chirdName = "아기";
		
		
		//업캐스팅 : 명시를 하지 않더라도 자동으로 작동된다.
		Human h01 = ch05; //ch05는 Chird타입이였는데 업캐스팅(Human)하였다. 따로 ch05앞에 (Human) 입력 안해도 된다.
		// h01 : Human, Professor, Chird
		
		
//		Human클래스를 객체화해서 Human타입 : Human만 가지고 있다
		Human hh01 = new Human(); // hh01은 Human객체화하여 Human타입만 가지고 있다.(Professor, Chird 는 없다)
		//Human타입으로    new Human으로 객체화해서
		
		//Human
		hh01.age = 40;
		
//		Professor pp02 = (Professor) hh01; //실행시 오류 : ClassCastException
		//hh01은 Human타입으로 Human을 객체화했기 때문에 Human밖에 없다. Professor타입을 내포하고 있지않아서 실행시 오류발생!
		
		
//		Professor 를 객체화해서 Human타입으로 지정
		Human ppp01 = new Professor();
		//ppp01객체는 Human타입(Professor 내포. Chird는 내포xxx)으로 Professor로 객체화했기 때문에 부모인 Human과 Professor만 내포함.
		
		//Human
		ppp01.name = "김길동";
		
		
		//다시 다운캐스팅하면... Human -> Professor  (다운캐스팅하려면 내포하고 있는 상태만 가능하다)
		Professor ppp02 = (Professor) ppp01; // Human타입인 ppp01을 다운캐스팅(Professor)
		
		//Human
		ppp02.name = "김";
		//Professor
		ppp02.professorId = 11;
		
		
//		Chird ch33 = (Chird) ppp02; // (현재 Professor타입인)ppp02엔 'Chird타입'이 없기 때문에 실행시 오류 발생한다
									//실행시 오류 발생 : ClassCastException
		
		//삼항연산자
		Chird ch44 = (ppp02 instanceof Chird) ? (Chird) ppp02 : null;
		           //         true,false라면             참     : 거짓
		           // ppp02에 Chird타입이 있다면...
		          //'  객체 instanceof 타입  ' : 객체에 타입이 존재하는지 여부
		System.out.println(ch44); // ppp02에 Chird타입이 없으니 'null' 출력.
		
		
		//Chird를 객체화해서 Chird타입으로 지정하면 Human,Professor,Chird 전부 내포(자신과 부모에 있는 모든 필드와 메소드 사용할 수 있다). 
		Chird cc01 = new Chird();
		
		//Human
		cc01.name = "김";
		//Professer
		cc01.professorId = 222;
		//Child
		cc01.chirdName = "손자";
		
		Professor p100 = cc01; //자식타입(Chird)을 부모타입인 Professor로 업캐스팅 (업캐스팅하려는 cc01앞에 명시 안해도 된다)
		
		Human hh100 = p100; // 자식타입(Professor)을 부모타입인 Human으로 업캐스팅.  (다운캐스팅은 명시해줘야한다.)
		
		Chird cc100 = (Chird) hh100; //Human타입인 hh100 을 자식타입 Chird로 다운캐스팅
		cc100.age = 90;
		
		//' cc100. ' 입력하면 자동으로 쓸 수 있는 필드,메소드 목록을 팝업해준다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
