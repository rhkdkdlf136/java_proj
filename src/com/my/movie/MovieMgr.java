package com.my.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieMgr {

	List<Movie> movies = new ArrayList<>();
	
	int index = 0; //방번호
	
	
	MovieMgr(){} //기본생성자
	
	
	void add(Movie m){
		
		//영화 정보를 입력(추가)
		//Movie객체 인풋 받아서, 스캐너로 인풋 받아서 필드안에 값 집어넣고 . 어레이리스트 받아서 값 집어넣는다
		
		movies.add(m);
		
////		movies.add(m);
//		System.out.println("영화명을 문자열로 입력하세요.>>>");
//		String title = sc.next();
////		movies.add(m)
//		
//		System.out.println("감독명을 문자열로 입력하세요.>>>");
//		String director = sc.next();
////		m.setDirector(director);
//		
//		System.out.println("등급을 정수로 입력하세요.>>>");
//		int grade = sc.nextInt();
////		m.setGrade(grade);
//		
//		System.out.println("장르를 문자열로 입력하세요.>>>");
//		String genre = sc.next();
////		m.setGenre(genre);
//		
//		movies.add(new Movie(title, director, grade, genre));
	}
	
	
	void search(){
		
		//ArrayList에 저장된 전체 영화 정보를 출력
		//어레이리스트 안에 있는 모든 내용 전체 출력 . 무비객체를 받아서
		
		for (int i = 0; i < movies.size(); i++) {
			Movie m = movies.get(i);
			System.out.println("영화제목 : " + m.getTitle() + "감독명 : " + m.getDirector() + "등급 : " + m.getGrade() + "장르: " + m.getGenre());
		}
		
		
	}
	
	void search(String title){
		//영화 제목을 인풋받아서 해당 제목에 대한 영화 정보만 출력
		//제목을 인풋받아서, 제목만 검색해서 출력해주는

		boolean s = false;
		
		for (int i = 0; i < movies.size(); i++) {
			Movie m = movies.get(i);
			if (title.equals(m.getTitle())) {
				System.out.println("영화 명: " + m.getTitle() + ", 감독 명: " + m.getDirector() + ", 영화 등급: " + m.getGrade() + ", 장르: " + m.getGenre());
				s = true;
			}
		}
		
		if(!s) {
			System.out.println("입력한 영화명과 일치하는 영화목록이 없습니다.");
		}
//		System.out.println("찿고자 하는 영화명 입력하세요.>>>");
//		title = sc.next();

//		for (Movie movie : movies) {
//			if(movie.getTitle().equals(title)) {
//				movie.toString();
//				return;
//			}
//		}
//		for (int i = 0; i < movies.size(); i++) {
//			if (title.equals(movies.get(i).getTitle())) {
//				System.out.println("제목 : " + movies.get(i).getTitle());
//			}
//		}
		
		
	}
	
	void searchDirector(String name){
		//영화 감독을 인풋받아서 감독이 저장된 영화정보를 출력
		//감독이름 인풋 받아서(어레이리스트안에있는) 검색하여 출력
		boolean s = false;
		
		for (int i = 0; i < movies.size(); i++) {
			Movie m = movies.get(i);
			if (name.equals(m.getDirector())) {
	        	System.out.println("영화 명: " + m.getTitle() + ", 감독 명: " + m.getDirector() + ", 영화 등급: " + m.getGrade() + ", 장르: " + m.getGenre());
				s = true;
			}
		}
		if (!s) {
			System.out.println("입력한 감독명과 일치하는 영화목록이 없습니다");
		}
		
//		System.out.println("찿고자 하는 영화명 입력하세요.>>>");
//		director = sc.next();

//		for (Movie movie : movies) {
//			if(movie.getDirector().equals(director)) {
//				movie.toString();
//				return;
//			}
//		}
		
//		for (int i = 0; i < movies.size(); i++) {
//			if (director.equals(movies.get(i).getDirector())) {
//				System.out.println("제목 : " + movies.get(i).getDirector());
//			}
//		}
		
		
	}
	
	List<Movie> searchGenre = new ArrayList<>();
	
	void searchGenre(String genre){
		//장르를 인풋받아서 검색해서 새로운 ArrayList에 저장해서 List<Movie>
		
		boolean s = false;
		searchGenre.clear();
		
		for (int i = 0; i < movies.size(); i++) {
			Movie m = movies.get(i);
			if (genre.equals(m.getGenre())) {
	        	System.out.println("영화 명: " + m.getTitle() + ", 감독 명: " + m.getDirector() + ", 영화 등급: " + m.getGrade() + ", 장르: " + m.getGenre());
	        	s = true;
			}
		}
		if (!s) {
			System.out.println("입력한 영화명과 일치하는 영화목록이 없습니다"); 
			
		}
		
//		System.out.println("찿고자 하는 영화명 입력 :");
//		genre = sc.next();
//		
//		for (Movie movie : movies) {
//			if(movie.getGenre().equals(genre)) {
//				movie.toString();
//				return;
//			}
//		}
		
		//장르 인풋 받아서
		//무비객체를 돌려준다
//		검색한 내용을 리스트에 담아서 
//		출력하는 쪽에서 출력구문을 만들어줘야한다.
		
	}
	
	void delete(String title){
		//제목이름으로 삭제
		boolean s = false;
		for (int i =0; i < movies.size(); i++) {
			movies.remove(i);
			System.out.println("영화명: " + title + "인 행이 삭제되었습니다");
			s = true;
			break;
		}
		if(!s) {
			System.out.println("입력한 영화명과 일치하는 영화목록이 없습니다.");
		}
		
		
		
//		System.out.println("찿고자 하는 영화명 입력 :");
//		title = sc.next();
		
//		Iterator<Movie> iterator = movies.iterator();
//		
//		while (iterator.hasNext()) {
//			if (title.equals(m.getTitle())) {
//				iterator.remove();
//				System.out.println("섹제 : " + m.getTitle());
//			} 
//		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
