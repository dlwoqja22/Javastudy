package SecondPackage.OP;

// 증강연산자 ++, --
// 변수 앞 또는 변수 뒤에 사용되느냐에 따라 동작(해석)이 달라집니다.
public class OperationEx2 {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		// ++변수 앞에 사용되면, +1을 변수에 적용한 후 값을 읽어온다.
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1); // 151
		
		// --변수 앞에 사용되면, -1을 변수에 적용한 후 값을 읽어온다.
		int lastScore2 = --gameScore;
		System.out.println(lastScore2); //150
		
		System.out.println(gameScore); //150
	}
}