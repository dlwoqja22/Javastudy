package Chapter10.multiinterfaceEX;

// 클래스는 단일 상속 허용, 다중 상속은 금지되어 있다.
// 클래스가 인터페이스 상속은 다중 상속이 가능하도록 설계되어 있다.
// 구현 클래스
public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {		
		System.out.println("구매하기");
	}
	
	// 부모 인터페이스 2개 이상일 경우 동일한 default 메서드를 가지고 있는 경우
	// 구현 클래스는 1개로 재정의 해야한다.
	@Override
	public void order() {
		// 부모 인터페이스의 default 메서드 호출
		// Buy.super.order();
		// Sell.super.order();
		System.out.println("고객판매주문");
	}
}