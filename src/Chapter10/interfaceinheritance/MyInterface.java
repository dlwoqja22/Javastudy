package Chapter10.interfaceinheritance;

// 클래스가 부모 인터페이스를 상속 implements
// 클래스들 끼리 상속하기 extends
// 인터페이스 끼리 상속하기 extends
public interface MyInterface extends X, Y {
	
	// x(), y() 2개와 myMethod() 1개 까지 포함해서 총 3개의 추상 메서드를 가지고 있는 의미.
	void myMethod();

}