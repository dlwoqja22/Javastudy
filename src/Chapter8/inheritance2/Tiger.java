package Chapter8.inheritance2;

public class Tiger extends Animal {
	
	@Override
	void run() {
		System.out.println("호랑이가 달린다.");
	}
	
	@Override
	void cry() {
		System.out.println("호랑이가 어흥한다.");
	}
}