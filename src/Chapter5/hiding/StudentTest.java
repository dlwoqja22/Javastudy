package Chapter5.hiding;

public class StudentTest {

	public static void main(String[] args) {
		// 객체 생성 작업
		// s1객체(스텍영역)에는 new Student() 힙영역의 생성된 기억장소
		Student s1 = new Student();
		s1.address = "노원구";
		s1.studentId = 1;
		s1.grade = 5;
		s1.studentName = "홍길동";
		
		// private score필드는 접근금지.
//		s1.score = -23;
		
		s1.setScore(200);
		
		System.out.println(s1.getScore());
	}
}