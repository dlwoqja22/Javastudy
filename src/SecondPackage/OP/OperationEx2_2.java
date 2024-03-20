package SecondPackage.OP;

public class OperationEx2_2 {

	public static void main(String[] args) {
		
		
		int gameScore = 150;
		
		// 변수++ 사용되면, 변수의 값을 먼저 읽어와서 좌측에 대입하고, 나중에 변수 +1을 적용한다.
		int lastScore1 = gameScore++;
		System.out.println(lastScore1); //150
		
		// 변수-- 사용되면, 변수의 값을 먼저 읽어와서 좌측에 대입하고, 나중에 변수 -1을 적용한다.
		int lastScore2 = gameScore--;
		System.out.println(lastScore2); //151
		
		System.out.println(gameScore); //150
	}
}