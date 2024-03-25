package Chapter6.staticex;

public class CompanyTest {
	
	public static void main(String[] args) {
		
		// 싱글튼 패턴 클래스로 객체 생성 불가능
//		Company company = new Company();
		
		// com1, com2, 은 미리 생성된 동일한 객체의 주소를 갖게된다.
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
	    System.out.println(com1 == com2);
	}
}