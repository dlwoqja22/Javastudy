package Chapter7.array;

// 향상된 for 문과 배열
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		// 문자열 배열
		String[] strArray = {"유비", "관우", "장비"};
		
		//전통적인 for
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		//향상된 for
		for(String ai : strArray) {
			System.out.println(ai);
		}
	}
}