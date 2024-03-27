package Chapter9.abstractex;

// 추상 클래스는 abstract 키워드를 사용해야 한다.
// 특징: (1)객체 생성 불가능(new 생성자) (2)상속을 목적 (3)상속을 받는 자식 클래스는 강제적으로 구현해야 한다.
// 몸체가 없는 메서드(추상 메서드) : 메서드의 기능을 정의 할 필요가 없다고 결정 했을 때 추상 클래스로 구성한다.
public abstract class Animal {
	
	//필드
	String eyeClolr;
	String speed;
	
	//메서드
	
	//추상 메서드 : 몸체(body) 없는 메서드
	abstract void run();
	
	abstract void cry();

}