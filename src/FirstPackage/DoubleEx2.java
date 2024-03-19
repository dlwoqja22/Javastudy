package FirstPackage;

public class DoubleEx2 {

	public static void main(String[] args) {
		// 실수 데이터 타입이 부동 소수점 방식으로 표현하여, 오차를 일으키는 예제.
		double dnum = 1; // 1D or 1d
		
		// 0.1을 10000번 누적되는 합은? 예상 1000.
		for (int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum); // 1001.000000000159
	}
}