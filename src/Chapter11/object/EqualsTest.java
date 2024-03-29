package Chapter11.object;


class Student /* extends Object */ {
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		// super(); 컴파일하면, 자동생성됨.
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentId + "," + studentName;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode");
		// 주소값
//		return super.hashCode();
		return studentId;
	}

	// st1.equals(st3)
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()메서드");
//		return super.equals(obj);
		//st1과 st3의 객체가 가리키는 힙영역의 데이터를 비교하는 구문.
		if(obj instanceof Student) {
			Student std = (Student) obj;
			// 힙영역의 값비교.
			if(studentId == std.studentId && studentName.equals(std.studentName))
				return true;
			else 
				return false;
		}
		return false;
	}
}

public class EqualsTest {
	
	public static void main(String[] args) {
		
		Student st1 = new Student(7, "손흥민");
		Student st2 = st1; // 객체의 주소대입
		
		Student st3 = new Student(7, "손흥민");
		
		// st1객체의 주소와 st3객체의 주소는 다르다. 
		
		// 주소 비교
		if(st1 == st2) {
			System.out.println("st1과 st2는 주소가 같습니다.");
		} else {
			System.out.println("st1과 st3는 주소가 같지 않습니다.");
		}
		
		// equals()메서드 : Object 클래스 에서도 주소값으로 비교하지 말고 객체가 참조하는 힙영역의 데이터로 비교하여 판단
		if(st1.equals(st2)) {
			System.out.println("st1과 st2는 동일합니다.");
		} else {
			System.out.println("st1과 st2는 동일하지 않습니다.");
		}
		
		// 주소 비교
		if(st1 == st3) {
			System.out.println("st1과 st3는 주소가 같습니다.");
		} else {
			System.out.println("st1과 st3는 주소가 같지 않습니다.");
		}
		
		// equals()메서드 : Object 클래스 에서도 주소값으로 비교하지 말고 객체가 참조하는 힙영역의 데이터로 비교하여 판단 
		if(st1.equals(st3)) {
			System.out.println("st1과 st3는 동일합니다.");
		} else {
			System.out.println("st1과 st3는 동일하지 않습니다.");
		}
		
		// 정리
		// 객체 비교시 내부적으로 Object 클래스의 equals(), hashCode()메서드가 동작된다. (주소값으로 비교)
		// 객체가 참조하고 있는 힙영역의 데이터로 비교하도록, equals(), hashCode() 메서드를 재정의하자.
		
		// toString()메서드가 자동으로 호출
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		// 해쉬 코드값 :  힙영역의 기억장소를 가리킬때 사용하는 코드값.
		System.out.println(st1.hashCode()); // 1129670968
		System.out.println(st2.hashCode()); // 1129670968
		System.out.println(st3.hashCode()); // 1023714065
	}
}