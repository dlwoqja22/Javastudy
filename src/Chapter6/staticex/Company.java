package Chapter6.staticex;

// 디자인 패턴중 싱글튼
// 싱글튼 패턴 디자인 : 단 하나의 객체만 생성을 하고자 하는 목적.
public class Company {
	
	// 클래스 안에서 자신을 private static 맴버로 객체생성.
	private static Company instance = new Company();
	
	//생성자
	private Company() {}
	
	//public getter 메서드 정의 : instance 가 private 이므로 클래스 외부에서 접근이 막아져 있으므로 getter 메서드 사용.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}	
}