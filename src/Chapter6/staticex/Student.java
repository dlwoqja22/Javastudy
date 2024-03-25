package Chapter6.staticex;

// JVM이 운영체제로부터 메모리 할당을 위임받아서, 자바프로그램을 실행할 때, 사용되는 메모리의 영역을 학습하는 예제.
// static area(method area) : 정리 영역
public class Student {
	
	//필드 선언
	//필드가 private 접근자일 때만 getter/setter
	//문법> 접근자 [static 선택] 데이터 타입 변수;
	
	// 자바 프로그램이 실행될 때, JVM이 클래스의 내용을 보고, static 키워드를 사용하는 필드, 메서드에 대하여 static area 메모리를 생성한다.
	// static 필드(정적 필드)
	private static int serialNum; //static 필드를 접근하는 메서드는 static 이어야 한다.
	
	// 인스턴스(instance) 필드 : Student stu1 = new Student(); 객체생성구문이 실행이 될때만 stack, heap 영역의 메모리를 사용한다.
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	private int count;
	
	//getter 메서드 : studentName필드로 생성된 기억 장소의 값을 읽어오기 위한 목적의 메서드
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//3개 필드에 대한 getter/setter 메서드 선언하기
	// int grade;
	public int getGrade() {

//		serialNum++; 사용가능. static 필드 또는 메서드는 JVM이 자동으로 메모리를 생성해주기 때문에, 인스턴스 메서드가 호출이 된다면, 먼저 생성되어 있는 메모리 접근이 당연하므로 문제가 안된다.
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	//static int serialNum;
	public static int getSerialNum() {
//		studentName = "유비"; 에러발생
		serialNum++;
		
		// static 필드는 클래스명.static필드로 기억장소를 접근한다.
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		
		//static 필드는 클래스명.static필드로 기억장소를 접근한다.
		 Student.serialNum = serialNum;
	}
}