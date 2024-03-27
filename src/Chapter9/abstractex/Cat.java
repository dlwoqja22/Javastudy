package Chapter9.abstractex;

// 추상 클래스를 부모로 상속받으면, 자식 클랙스는 추상 메서드를 반드시 재정의(구현 : implement)해야 한다(규칙)
public class Cat extends Animal {
	
	@Override
	void run() {
		System.out.println("고양이가 달린다");
	}
	
	@Override
	void cry() {
		System.out.println("고양이가 울부짖는다.");
	}
}