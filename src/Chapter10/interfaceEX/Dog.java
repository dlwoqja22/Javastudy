package Chapter10.interfaceEX;

public class Dog implements Animal {

	@Override
	public void run() {
		System.out.println("강아지가 달린다.");

	}

	@Override
	public void cry() {
		System.out.println("강아지가 울부짖는다.");

	}
}