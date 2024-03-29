package Chapter11.object;

// 객체 복사 : 힙영역에 생성된 메모리가 또 하나의 메모리로 복사
// 객체(인스턴스) : 힙영역에 생성된 메모리 그 자체
// 객체 복사 : Object 클래스의 clone()메서드를 사용
// 객체 복사를 하기 위한 클래스는 Cloneable 인터페이스를 상속 받아야 한다. 
public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 30); 
		// clone() : 메모리 복사 기능
		Circle copyCircle = (Circle) circle.clone();
		
		// toString()메서드가 값을 확인하는 용도로 재정의가 되어 있어
		// circle 객체 원본 메모리 내용과 copyCircle 객체 사본 메모리 내용을 확인
		System.out.println(circle); // circle.toString() 
		System.out.println(copyCircle); // copyCircle.toString() 
		
	}
}

class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Object 클래스의 toString()
	// toString() 메서드를 재정의 할때는 클래스의 필드 정보를 확인하는 용도로 한다.
	@Override
	public String toString() {
		
		return "x = " + x + "," + "y = " + y;
	}
}

// Circle 클래스를 객체로 생성하고, 객체복사로 사용하는 경우 Cloneable 인터페이스를 상속 받아야 한다.
class Circle implements Cloneable {
	
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		
		// point -> point.toString()
		return "원점은 " + point + "이고, " + "반지름은 " + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}