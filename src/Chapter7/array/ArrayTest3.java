package Chapter7.array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		// boolean 배열 데이터 타입으로 배열 이름 boolArr로 요소 10개를 생성 구문으로 작성하라.
		// 인덱스 0, 3, 6, 9 번은 true 로 변경하라.
		// for 문으로 배열을 출력하라
		
		// boolean 배열은 초기값이 false 이다.
		boolean[] boolArr = new boolean[10]; 
		
		boolArr[0] = true;
		boolArr[3] = true;
		boolArr[6] = true;
		boolArr[9] = true;
		
		for(int i=0; i<boolArr.length; i++) {
			System.out.println(boolArr[i]);
		}
	}
}