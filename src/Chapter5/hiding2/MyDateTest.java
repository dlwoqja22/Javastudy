package Chapter5.hiding2;

import Chapter5.hiding.MyDate;

//default 필드는 다른 패키지에서는 접근이 안된다.
public class MyDateTest {

	public static void main(String[] args) {
		
		// import 구문 때문에 Chapter5.hiding 패키지를 생략 가능 할 수 가있다.
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate();
		MyDate date3 = new MyDate();
		MyDate date4 = new MyDate();
		MyDate date5 = new MyDate();
		
		date1.day = 1; // public
		// date1.month = 10; // default는 private
	}
}