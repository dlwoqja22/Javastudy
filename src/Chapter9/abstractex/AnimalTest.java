package Chapter9.abstractex;

public class AnimalTest {

	public static void main(String[] args) {
		
		// Animal 추상 클래스를 객체 생성 할 수 없도록 설계되어있다.
		// Animal animal = new Animal(); 에러발생
		
		AnimalTest aTest = new AnimalTest();
		aTest.callMethodAnimal(new Cat());
		aTest.callMethodAnimal(new Dog());
		aTest.callMethodAnimal(new Lion());
		aTest.callMethodAnimal(new Tiger());
	}
	
	// 다형성
	private void callMethodAnimal(Animal animal) {
		animal.cry();
		animal.run();
	}
}