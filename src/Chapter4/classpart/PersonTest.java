package Chapter4.classpart;

public class PersonTest {

	public static void main(String[] args) {
		
		//Person클래스 사용 : 기억장소가 생성된다.
		Person ps1 = new Person();
		
		//ps1 객체가 가리키는 기억장소 표현
		ps1.name = "유비";
		ps1.height = 170;
		ps1.weight = 70;
		ps1.gender = 'M';
		ps1.married = true;	
		
		ps1.getPersonInfo();
		
		System.out.println("=======================");
		
		Person ps2 = new Person();
		
		ps2.name = "관우";
		ps2.height = 190;
		ps2.weight = 90;
		ps2.gender = 'M';
		ps2.married = true;		
		
		ps2.getPersonInfo();
		
		System.out.println("=======================");
		
		Person ps3 = new Person();
		
		ps3.name = "장비";
		ps3.height = 180;
		ps3.weight = 80;
		ps3.gender = 'M';
		ps3.married = true;
		
		ps3.getPersonInfo();
		
	}
}