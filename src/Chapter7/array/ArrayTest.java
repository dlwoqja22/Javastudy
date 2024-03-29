package Chapter7.array;

public class ArrayTest {

	public static void main(String[] args) {
		//배열 : 동일한 데이터 타입으로 연속된 기억 장소를 하나의 대표 이름으로 관리하는 기능
		/*
		 - 기본 데이터 타입으로 생성하는 배열
		 기본 데이터 타입[] 배열 이름 = new 기본 데이터 타입[] {값1, 값2, 값3, 값4, 값5};
		*/
		
		//int형 배열
		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		//인덱스가 5인 배열 요소를 60으로 변경하라.
		number[5] = 60;
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	}
}