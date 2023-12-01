package lab.ch10;

public class Inheritance_Test {

	public static void main(String[] args) {

//		상속 설정 후 필드와 메소드 생성
//		Animal > Tiger > TigerChird
//			   > Lion
//			   > Dog
	
//		업캐스팅 <===> 다운캐스팅
		
		
		Tiger t1 = new Tiger();
		
		t1.name ="자식타이거";
		t1.leg = 4;
		
		t1.eat();
		t1.sleep();
		
		System.out.println("Tiger ==========================");
		System.out.println();
		Tiger t2 = new Tiger("타이거타이거", 50);
		
		System.out.println();
		t2.goTo();
		t2.info();
		
		System.out.println();
		System.out.println("Animal ==========================");
		Animal ani = new Animal("애미멀","색깔");
		ani.eat();
		ani.sleep();
		
		
		System.out.println("Lion ==========================");
		Lion li = new Lion();
		li.eat();
		li.color = "갈색";
		System.out.println(li.color);
		
		System.out.println("");
		
		System.out.println("TigerChird ====================");
		TigerChird chird = new TigerChird();
		
		chird.name = "자식타이거 이름";
		chird.color = "자식타이거 색깔";
		
		System.out.println(chird.name);
		System.out.println(chird.color);
		
		
		
		
	}

}
