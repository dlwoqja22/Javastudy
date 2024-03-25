package Chapter7.array;

import Chapter6.staticex.Company;

// 생성자를 하나도 만들지 않으면, 컴파일 과정에서 자동생성 된다.
// 클래스 배열(객채배열)을 만들기 위한 클래스
public class Book {
	
	//필드
	private String bookName; //책제목
	private String author; //저자

	// 기본 생성자 형태. 생성자는 리턴 타입을 사용하지 않는다.
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName =  bookName;
		this.author = author;
	}
	
	//getter/setter 메서드 작성
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 일반 메서드
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}