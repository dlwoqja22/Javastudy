package Chapter8.casting;

// 형변환(Casting)
// 참조타입 : 클래스가 상속관계에 따른 형변환
public class ShapeTest {

	public static void main(String[] args) {
		
		// 부모 클래스 변수 = 자식 객체;
		// 업캐스팅 : 자식객체로 부모 클래서 형변환
		// Shape shape1 = (Shape) new Circle();
		Shape shape1 = new Circle();
		// draw(_)메서드가 부모, 자식 클래스에 같이 존재하면, 부모 클래스 변수는 자신의 draw()메서드를 호출 하도록 설계되어 있다.
		// 그리고 부모 클래스 변수는 자신의 구성 요소만 호출이 되도록 설계되어 있다.
		shape1.draw();
		//shape1.method1();
		
		Shape shape2 = new Rectangle();
		shape2.draw();
		
		Shape shape3 = new Triangle();
		shape3.draw();
		
		// shape1 객체가 Circle 클래스로 생셩된 객체인지 여부
		if(shape1 instanceof Circle) {
			
			// 다운캐스팅. 명시적형변환
			// 자식 클래스 변수 = (자식 클래스) 부모 객체.
			Circle c1 = (Circle) shape1;
			c1.method1();
		}
	}
}