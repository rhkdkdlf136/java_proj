package com.my.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieMgr {

	List<Movie> movies = new ArrayList<>();
	
	int index = 0; //방번호
	
	
	MovieMgr(){} //기본생성자
	
	
	void add(Movie m){
		//영화 정보를 입력(추가)
		//Movie객체 인풋 받아서, 스캐너로 인풋 받아서 필드안에 값 집어넣고 ArrayList로 받아서 값 집어넣는다
		movies.add(m);
		
	}
	
	
	void search(){
		//ArrayList에 저장된 전체(모든) 영화 정보를 출력
		for (int i = 0; i < movies.size(); i++) {
			Movie m = movies.get(i);
			System.out.println("영화제목 : " + m.getTitle() + "감독명 : " + m.getDirector() + "등급 : " + m.getGrade() + "장르: " + m.getGenre());
		}
	}
	
	void search(String title){
		//영화 제목을 인풋받아서 해당 제목에 대한 영화 정보만 출력
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
	}
	
	void searchDirector(String name){
		//영화 감독을 인풋받아서 해당감독이 저장된 영화정보를 출력
		//감독이름 인풋 받아서(ArrayList 안에 있는) 검색하여 출력
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
		
	}
	
	
	List<Movie> searchGenre = new ArrayList<>();
	
	void searchGenre(String genre){
		//장르를 인풋받아 검색
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
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
