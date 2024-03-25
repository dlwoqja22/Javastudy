package Chapter6.staticex;

public class PerconTest {

	public static void main(String[] args) {
		
		Person ps1 = Person.getInstance();
		Person ps2 = Person.getInstance();
		
		System.out.println(ps1 == ps2);
		
//		Person ps3 = new Person(); 오류! 오류! 오류!
	}
}