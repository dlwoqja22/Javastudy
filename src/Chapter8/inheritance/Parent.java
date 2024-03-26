package Chapter8.inheritance;

public class Parent {
	

    private int a;
    private int b;
	
	public Parent() {
		System.out.println("부모 생성자 호출 : Parent()");
	}
	
	//매개 변수가 있는 생성자
	public Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void methodA() {}
	
	void methodB() {}
}