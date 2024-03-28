package Chapter11.object;

class Book {
	
	// 필드
	int bookNumber;
	String bookTitle;
	
	// 매개 변수가 있는 생성자
	public Book(int bookNumber, String bookTitle) {
		super(); // 부모 클래스의 기본 생성자 호출
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	// 재정의 : 필드의 정보를 확인하는 목적
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringEx {
	
	public static void main(String[] args) {
		
		Book book1 = new Book(200, "개미");
		
		// toString()메서드를 재정의 하지 않으면, Object 클래스의 toString()메서드는
		// 다음과 같이 출력된다. Chapter11.object.Book@75a1cd57
		// 재정의 한 경우에는 Book [bookNumber = 200, bookTitle = 개미] 출력된다.
		System.out.println(book1); // System.out.println(book1.toString());
		
	}
}