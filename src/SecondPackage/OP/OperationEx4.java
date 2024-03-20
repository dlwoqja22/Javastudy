package SecondPackage.OP;

// 조건 연산자 : if문과 유사.
public class OperationEx4 {
	
	public static void main(String[] args) {
		
		int fatherAge = 47;
		int motherAge = 45;
		
		char ch; // 숫자로 사용시 0 ~ 65535 범위를 갖는다.
		ch = (fatherAge > motherAge) ? 'T':'F';
		
		System.out.println(ch); // T
	}
}