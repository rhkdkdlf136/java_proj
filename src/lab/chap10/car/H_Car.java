package lab.chap10.car;

public class H_Car extends Car {

	
//	※애너테이션(@)  (스프링에서 자주 씀.) 
//		- @Override : 부모의 메소드를 오버라이딩하겠다
	
	//run 입력 후 'crtl + 스페이스바' 누르면 목록 팝업창에서 '오바라이딩' 선택 할 수 있다
	@Override //주석처리하고 실행시켜도 돌아간다
	void run() {
//		// TODO Auto-generated method stub
//		super.run();
		System.out.println("현대자동차(H_Car) 달린다");
		
	}
	
	
	
//	void run() {
//		System.out.println("현대자동차는 부릉하고 달립니다.");
//	}
	
	
//	@Override
//	void run2() { //부모에 없는 메소드라고 확인해준다
//		System.out.println("현대자동차는 부릉하고 달립니다.");
//	}
//	
	
	void run2() { //오버라이딩이 아닌 새로운 메소드
		System.out.println("현대자동차는 부릉하고 달립니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
}
