package Chapter2.ForEx;

// 반복문 : for 문
public class ForExample1 {
	
	public static void main(String[] args) {
		
		// 1 ~ 100까지의 합을 구하라.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ 100까지의 합은" + sum + "입니다.");
	}
}
