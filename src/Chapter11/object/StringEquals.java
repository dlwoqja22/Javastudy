package Chapter11.object;

// 문자열 비교
public class StringEquals {

	public static void main(String[] args) {
		
		 // 기본 데이터 타입 사용법 처럼 사용 가능. int a = 100;
//		 String name = "홍길동";
		 
		 // String 은 클래스 이므로, 참조 타입 처럼 사용
		 String str1 = new String("abc");
		 String str2 = new String("abc");
		 
		 // ==  비교 연산자는 주소값을 비교 가능
		 System.out.println(str1 == str2); // false
		 System.out.println(str1.equals(str2));
		 
		 //데이터 비교시
		 /*
		  - 기본 데이터 타입 == 비교
		  - 문자열 데이터 타입(String)은 equals()메서드 사용
		 */
		 
		 int a = 100;
		 int b = 100;
		 
		 if (a == b) {
			 System.out.println("a와 b는 데이터가 동일하다");
		 }else {
			 System.out.println("a와 b는 데이터가 동일하지 않다.");
		 }
		 
		 String name1 = "홍길동";
		 String name2 = "홍길동";
		 
		 // String 클래스 이므로 == 주소값 비교가 진행된다.
		 if (name1 == name2) {
			 System.out.println("name1과 name2는 데이터가 동일하다");
		 }else {
			 System.out.println("name1과 name2는 데이터가 동일하지 않다.");
		 }
		 
		 // 재정의 되어, 문자열 데이터 비교
		 if (name1.equals(name2)) {
			 System.out.println("name1과 name2는 데이터가 동일하다");
		 }else {
			 System.out.println("name1과 name2는 데이터가 동일하지 않다.");
		 }
	}
}