package Chapter11.wrapper;

// wrapper 클래스
/*
기본 데이터 타입을 객체 관점으로 사용할 때 기능을 제공한다.

기본 데이터 타입           Wrapper 클래스
booelan                 Bpoelan
byte                    Byte
char                    Character
short                   Short
int                     Integer
long                    Long
float                   Float
double                  Double

 */
public class IntegerTest {
	
	public static void main(String[] args) {
		
		// Boxing 과 UnBoxing
		// Boxing : 기본형을 객체형으로 변환하여 저장하는 것.
		// UnBoxing : 객체형을 기본형으로 꺼내오는 것.
	
		// 참조 타입 클래스 변수 = 기본 데이터 타입값;
		// 100 데이터가 힙영역에 기억 장소를 생성하고, 들어가는 과정을 Boxing 형변환 이 진행된다 라고 한다.
		Integer num = 100; // Boxing
		int iNum = num.intValue(); // Integer 클래스에서 정수값만 가져옴.. UnBoxing
		int jNum = 200;
		
		int sum = iNum + jNum;
		System.out.println(sum);
		
	}
}