package Chapter8.inheritance;

public class Child extends Parent {
	
	//상속
	
	//추가
	private int c;
	private int d;
	
	public Child() {
		//super();
		System.out.println("자식 생성자 호출 : Child()");
	}
	
	//매게 변수가 있는 생성자
	public Child(int a, int b) {
		super(a,b); // 부모 클래스의 생성자 호출
	}
	
	void methodC() {}
	
	void methodD() {}

	// 컴파일러는 부모 클래스의 메서드를 재정의하는 의미로 아래 코드를 해석
	@Override // Annotation. 메서드 재정의
	void methodA() {
		super.methodA();
	}
}