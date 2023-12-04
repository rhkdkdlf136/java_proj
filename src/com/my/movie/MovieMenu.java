package com.my.movie;

import java.util.List;
import java.util.Scanner;

public class MovieMenu {
	
//	스캐너 만들어서 인풋 받아서 메소드 호출
	Scanner sc = new Scanner(System.in);
	
	MovieMgr myMenu = new MovieMgr();
	Movie a = new Movie();
	

	MovieMenu(){} //기본 생성자
	
	
	void movieMenu() {
	//영화 관리 프로그램에 해당하는 메인 메뉴 출력. 
	//스캐너로 각 메뉴를 선택해서 반복 출력 되게 한다.
out:do {
		System.out.println("1.영화 정보 입력");
		System.out.println("2.영화 정보 전체 검색");
		System.out.println("3.영화명 검색");
		System.out.println("4.영화 감독별 검색");
		System.out.println("5.영화 장르별 검색");
		System.out.println("6.영화 정보 삭제");
		System.out.println("0.종료");
		System.out.println("위 정수를 입력하세요.>>>");
		int select = sc.nextInt();
		
		switch (select) {
			case 1:
				System.out.println("영화명을 문자열로 입력하세요");
				String Mytitle = sc.next();
				a.setTitle(Mytitle);
				
				System.out.println("감독명을 문자열로 입력하세요.");
				String Mydirector = sc.next();
				a.setDirector(Mydirector);
				
				System.out.println("등급을 정술 입력하세요");
				int Mygrade = sc.nextInt();
				a.setGrade(Mygrade);
				
				System.out.println("장르를 문자열로 입력하세요");
				String Mygenre = sc.next();
				a.setGenre(Mygenre);
				
				myMenu.add(new Movie(a.getTitle(), a.getDirector(), a.getGrade(), a.getGenre()));
				System.out.println("성공적으로 추가되었습니다.");
				System.out.println(">>>");
				break;
				
			case 2:
				System.out.println("추가된 영화의 정보입니다");
				myMenu.search();
				System.out.println(">>>");
				break;
				
			case 3:
				System.out.println("검색할 영화명을 입력하세요");
				String sTitle = sc.next();
				myMenu.search(sTitle);
				System.out.println(">>>");
				break;
				
			case 4:
				System.out.println("검색할 감독명을 입력하세요");
				String sDirector = sc.next();
				myMenu.searchDirector(sDirector);
				System.out.println(">>>");
				break;
				
			case 5:
				System.out.println("검색할 영화장르를 입력하세요");
				String sGenre = sc.next();
				myMenu.searchGenre(sGenre);
				break;
				
			case 6:
				System.out.println("삭제할 영화명을 입력하세요");
				String dTitle = sc.next();
				myMenu.delete(dTitle);
				System.out.println(">>>");
				break;
				
			default :
				break out;
		}
		
		
		
	} while(true);
	System.out.println("프로그램 종료");
	sc.close();

	}
		
	
}
