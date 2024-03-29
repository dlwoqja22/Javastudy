package Chapter11.classEx;

// Class 객체를 생성하는 방법
public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// Person.class
		Person person = new Person();
		
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class; // 직접 class파일 사용
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("Chapter11.classEx.Person");
		System.out.println(pClass3.getName());
	}
}