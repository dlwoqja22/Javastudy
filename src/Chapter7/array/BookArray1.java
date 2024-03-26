package Chapter7.array;

public class BookArray1 {

	public static void main(String[] args) {
		
		// 스택영역(주소) -> 힙영역(데이터)
		Book b1 = new Book("해리포터","J.K롤링");
		Book b2 = new Book("반지의제왕","J.R.R톨킨");
		Book b3 = new Book("얼음과불의노래","조지R.R마틴");
		
		System.out.println(b1.getBookName() + "/" + b1.getAuthor());
		System.out.println(b2.getBookName() + "/" + b2.getAuthor());
		System.out.println(b3.getBookName() + "/" + b3.getAuthor());
		
		// 클래스배열(객채배열)
		// 스택영역(주소) -> 힙영역(주소) -> 힙영역(데이터)
		// 메모리 구조 표현
		Book[] bookArray = new Book[3]; // 이 줄의 의미는 힙영역에서 실제 데이터가 생성되는 주소를 참조
		bookArray[0] = new Book("해리포터","JK롤링"); // 실세 데이터가 관리되는 힙영역의ㅣ 기억장소 생성작업.
		bookArray[1] = new Book("반지의제왕","JRR톨킨");
		bookArray[2] = new Book("얼음과불의노래","조지RR마틴");
		
		System.out.println(bookArray[0].getBookName() + "/" + bookArray[0].getAuthor());
		System.out.println(bookArray[1].getBookName() + "/" + bookArray[1].getAuthor());
		System.out.println(bookArray[2].getBookName() + "/" + bookArray[2].getAuthor());
		
		for(int i=0; i<bookArray.length; i++) {
			System.out.println(bookArray[i].getBookName() + "/" + bookArray[i].getAuthor());
		}
	}
}