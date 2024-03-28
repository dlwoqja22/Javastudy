package Chapter10.interfaceEX2;

// 최상위 부모 인터페이스 : 상속 목적으로 설계, 객체 생성 불가능
public interface Calc {
	
	// 구성 요소
	// 상수, 추상 메서드, default 메서드, static 메서드 - JDK 1.0
	// private 메서드 - JDK 1.9
	
	// 상수, final. compile 하면 public, final, static, 자동으로 붙는다.
	double PI = 3.14; // 상수는 어떤 특정값을 부르기 위한 이름.
	int ERROR = -999999999;
	
	//추상 메서드 compile 하면 public, abstract 자동으로 붙는다.
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 일반 메서드 사용 불가
//	public void methodA() {}
	
	// JDK 1.8부터 default, static 메서드가 지원
	default void description() {}
	
	static void myStaticMethod() {}
	
	// JDK 1.9부터 private 메서드가 지원 / private 접근자는 접근 불가
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}

}