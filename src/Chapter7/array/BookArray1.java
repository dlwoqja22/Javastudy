package Chapter7.array;

public class BookArray1 {

	public static void main(String[] args) {
		
		// 스택영역(주소) -> 힙영역(데이터)
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		// 클래스배열(객채배열)
		// 스택영역(주소) -> 힙영역(주소) -> 힙영역(데이터)
		// 메모리 구조 표현
		Book[] bookArray = new Book[3]; // 이 줄의 의미는 힙영역에서 실제 데이터가 생성되는 주소를 참조
		bookArray[0] = new Book(); // 실세 데이터가 관리되는 힙영역의ㅣ 기억장소 생성작업.
		bookArray[1] = new Book();
		bookArray[2] = new Book();
	}
}