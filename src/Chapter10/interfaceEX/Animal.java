package Chapter10.interfaceEX;

// 인터페이스
// 추상 메서드 목적으로 존재하는 것
// 추상 메서드 : 구현 클래스에게 강제적으로 추상 메서드를 구현하게 만든다. 즉 기능에 해당하는 메서드 작업을 강제적으로 하게 만든다.
// 객체 생성 불가능
// 상속을 목적으로 한다.
public interface Animal {
	
	//필드 사용 불가능
//	String eyeClolr;
//	String speed;
	
	//메서드 사용 불가능
//	void methodA() {}
	
	void run(); // public abstract void run();
	
	void cry(); // public abstract void cry();
}