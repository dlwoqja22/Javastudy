package Chapter10.interfaceEX2;

// 추상 클래스 : 상속 목적으로 설계, 객체 생성 불가능
public abstract class Calculator implements Calc {
	
	//구현되지 않은 추상 메서드를 2개 상속 받은 상태

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
}