package Chapter10.interfaceEX2;

// 구현 클래스 -> 객체 생성
public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	//디폴트 메서드 재정의
	@Override
	public void description() {}
}