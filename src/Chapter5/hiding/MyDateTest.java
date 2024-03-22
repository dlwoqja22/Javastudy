package Chapter5.hiding;

// default 필드는 동일한 패키지 일 경우는 접근
public class MyDateTest {
	
	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		date.day = 1; //public
		date.month = 10; // dafault는 public
//		date.year = 2024; private 접근자로 되어있기 때문에 접근이 안되는 특징이 있다.
		
		
	}
}