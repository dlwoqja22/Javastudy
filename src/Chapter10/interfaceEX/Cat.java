package Chapter10.interfaceEX;

// 인터페이스를 상속 받는 클래스는 implements 사용해야 한다.
// 구현 클래스
public class Cat implements Animal {

	// 부모 인터페이스의 추상 메서드를 구현한다.(구현 메서드) 재정의 메서드라고 부를 수 도 있다.
	@Override
	public void run() {
		System.out.println("고양이가 달린다.");
	}

	@Override
	public void cry() {
		System.out.println("고양이가 울부짖는다.");
	}
}