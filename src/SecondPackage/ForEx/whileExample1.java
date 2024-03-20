package SecondPackage.ForEx;

//반복문 : while문
public class whileExample1 {

	public static void main(String[] args) {
		//1 ~ 100까지의 합을 구하라.
		
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ 100까지의 합은" + sum + "입니다.");
		System.out.println("i의 변수값은? " + i);
	}
}