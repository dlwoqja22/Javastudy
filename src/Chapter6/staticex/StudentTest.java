package Chapter6.staticex;

public class StudentTest {

	public static void main(String[] args) {
        // JVM이 main()메서드를 호출하면서, 프로그램이 실행될 때, Student 클래스의 static 필드와 메서드를 이용하여, static area에 메모리를 생성한다.
        // static area에 메모리를 단 1번만 생성한다. 공유의 목적	
		
		Student stu1 = new Student(); // 스텍영역과 힙영역에 메모리 생성
//      stu1.studentName = "유비";
		stu1.setStudentName("유비");
		// static 메서드는 클래스명.메서드명() 호출해야한다. 객체.메서드명()으로 호출을 되나, 사용하지 말 것.
		System.out.println(Student.getSerialNum()); // 1
		
		Student stu2 = new Student(); //스텍영역과 힙영역에 메모리 생성
		stu2.setStudentName("관우");
		System.out.println(Student.getSerialNum()); // 2
	}
}