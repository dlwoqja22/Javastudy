package Chapter10.multiinterfaceEX;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		//부모 인터 페이스 변수
		Buy buyer = customer;
		buyer.buy();
		
		//부모 인터 페이스2 변수
		Sell seller = customer;
		seller.sell();
		seller.order(); //재정의된 메서드 호출
		
		if(seller instanceof Customer) {
			// 다운 캐스팅.         자식 클래스 변수 = (자식 클래스)부모 클래스 객체
			Customer customer2 = (Customer) seller;
			
			customer2.buy();
			customer2.sell();
		}
		customer.order(); //재정의된 메서드 호출
	}
}