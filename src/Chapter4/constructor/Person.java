package Chapter4.constructor;

// 생성자 예제(Constructor)
public class Person {
	
	//필드
	String name;
	float height;
	float weight;
	
	// 생성자
	// 컴파일과정에서 Person.class 파일에 기본생 성자가 자동 생성된다.
	
	// 생성자 메서드 이름을 만들 때는 클래스 이름을 사용해야 한다. (규칙)
	// 생성자를 수동으로 정의하면, 컴파일 과정에서 Person.class 파일에 기본 생성자가 자동으로 생성이 안된다.
	
	/*
	public Person() {
		// 코드작성,
		System.out.println("생성자 호출");
	}
	*/
	
	// 매게변수가 있는 생성자를 정의하면, 컴파일과정 
	
	public Person(String n) {
		name = n; 		
	}
	
	public Person(float n) {
		height = n; 
	}
}