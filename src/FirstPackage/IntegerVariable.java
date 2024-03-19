package FirstPackage;

public class IntegerVariable {

	public static void main(String[] args) {
		//정수형 데이터 타입 : byte(1), short(2), int(4), long(8)
		//크기를 이용하여 기억장소를 생성한다.
		// 예로 byte 는 1바이트로 기억장솔르 생성한다.
		//byte는 8bit로 구정쇠어있다.
		//bit는 0, 1 2진수 값을 저장하도록 설계되어있다.
		
		short sval = 10;
		byte bval = 20;
		
		System.out.println(sval + bval);
		
		//long 데이터를 저장할 경우에는 숫자 데이터 끝부분에 알파벳L이나 ㅣ을 붙인다
		long lval = 12345678900L;
		
		System.out.println(lval);
		
	}
}
