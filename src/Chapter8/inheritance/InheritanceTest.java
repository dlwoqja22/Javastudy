package Chapter8.inheritance;

public class InheritanceTest {
	
	public static void main(String[] args) {
		
		// 상속을 받은 클래스가 객체 생성이 되면
		// 힙영역에 new Parent(), new Child() 순서로 진행.
		// 힙영역에 부모 클래스의 기억 장소가 생성되고, 부모 생성자 호출
		// 힙영역에 자식 클래스의 기억 장소가 생성되고, 자식 생성자 호출
		Child child = new Child();
		
		Child child2 = new Child(10, 20);
		
		Parent parent = new Parent(); //Child 클래스와 상관이 없다.
	}
}