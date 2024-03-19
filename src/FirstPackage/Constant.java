package FirstPackage;

public class Constant {

	public static void main(String[] args) {
		// 상수와리터럴
		
		// 상수선언 키워드 : final
		// 상수 이름은 대문자로 정의해줍니다. 이는 규칙이 아니라 관례입니다.
		// 상수 이름으로 값을 변경 불가능.
		final int MAX_NUM = 100; //final 키워드를 제외하면 변수라고 부릅니다.
		
//		MAX_NUM = 200; final 상수는 값을 변경하면 에러가 발생합니다.
		
		final int MIN_NUM;
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}
}