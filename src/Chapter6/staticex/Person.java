package Chapter6.staticex;

// 싱글튼 패턴 디자인으로 설계하라
public class Person {
	
	private static Person instance = new Person();
	
	private Person() {}
	
	public static Person getInstance() {
		if(instance == null) {
			instance = new Person();
		}
		return instance;
	}
}