package com.my.movie;

public class Movie {

	
	private String title;
	private String director;
	private int grade; //등급 12세이상 15세 이상 등
	private String genre; //sf, 시대물 , 호러물 등
	
	
	Movie(){} //기본생성자(  C : constructor)
	
	
	//생성자
	Movie(String title, String director, int grade, String genre){
		this.title=title;
		this.director=director;
		this.grade=grade;
		this.genre=genre;
	}

	
	
	
	
	//각 필드에 대한 + setter ( ) / getter ( ) 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	//toStirng 오버라이드
	//객체 출력시 각 필드에 대한 값 출력
	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", grade=" + grade + ", genre=" + genre + "]";
	}
	
	
	
	
}
