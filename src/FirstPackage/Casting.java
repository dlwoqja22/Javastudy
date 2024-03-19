package FirstPackage;

public class Casting {

	public static void main(String[] args) {
		// 형병환(Casting) 데이터 타입 변환 = 대입 연산자
		// 좌측 = 우측; 우측의 코드를 값으로 해석하여 좌측에 대입합니다.
		// 우측의 데이터 타입이 더 작다면 좌측의 데이터 타입에 맞게 변환 된 후에 저장됩니다.
		// 우측의 데이터 타입이 더 크다면 좌측의 데이터 타입과 맞게 변환되지 않고 에러가 나게 됩니다.
		// 좌측과 우측의 데이터 타입이 일치해야 합니다.
		
		int n = 10;
		double dnum = n;
		
		System.out.println(dnum);
	}
}