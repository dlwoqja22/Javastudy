package SecondPackage.ForEx;

// 중첩for문을 이용한 구구단 예제
public class GuGuDan {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(i == 0) {
				continue;
				}
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
		}
	}
}