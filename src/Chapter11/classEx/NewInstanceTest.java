package Chapter11.classEx;

// newInstance() 메서드를 사용해 클래스 객체 생성하기
public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// Person 클래스 설계(디자인) -> 객체 생성 작업
		Person person1 = new Person();
		System.out.println(person1);
		
		// 리플렉션 기법. "Chapter11.classEx.Person" 를 이용하여, person2 객체 생성
		Class pClass = Class.forName("Chapter11.classEx.Person");
		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2);
	}
}