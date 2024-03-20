package SecondPackage.ForEx;

// 반복문 : do ~ while
public class Dowhile {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		do {
			sum += i;
			i ++;
		}while(i <= 100);
		
		System.out.println("1 ~ 100까지의 합은 " + sum + "입니다.");
		System.out.println("i변수의 값은?" + i);

	}

}
