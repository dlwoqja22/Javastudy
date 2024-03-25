package Chapter4.classpart2;

public class StudentTest1 {

	public static void main(String[] args) {
		
		// https://lucas-owner.tistory.com/38
		// 운영체제로부터 JVM이 메모리 할당을 위임받아서 메모리를 여러개의 영역으로 나누어 관리한다.
 		// 메모리영역
		// 1)Stack Area 2)Heap Area 3)Method Area(Static Area)
		
        /* 
	       Stack Area : 
	  	   메서드 안에 변수 및 매개변수를 선언하면, 메서드가 실행이 될 때 변수 또는 매개변수의 이 영역에 기억장소가 생성
		   또 Student stu1; 클래스로 객체를 선언하면, 이 영역에 기억장소가 생성
       */
		
		
		/* 
	       Heap Area : 플러스로 객체를 선언하고 실행이 될 때 이 영역에 기억장소가 생성
           Heap Area new 키워드가 클래스의 내용을 가지고 이 영역에 기억장소가 생성
       */
		
		// 기본 데이터 타입 8 정수형 :byte, short, int, long 실수형: float, double 논리형: boolean 문자형: char
		// 기본 데이터 타입을 이용하여 메서드 안에서 변수를 선언하면, 기억장소는 스택영역에 생성한다.
		// 클래스로 변수(객체)로 선언하면, 스텍영역에 4바이트 크기로 생성한다.
		// 생성된 기억장소에는 앞으로 힙영역에 생성될 주소가 저장된다.
		// 예> Person ps1; ps1객체에 null 이 초기값으로 갖게된다.

		int a = 10; // stack area(스텍영역)
		char c = '가'; // stack area(스텍영역)

		// 객체 생성
		// new : 힙영역의 공간에 메모리(기억장소)를 생성하는 연산자.
		Student stu1 = new Student();
		stu1.studentName = "유비";
		
		Student stu2 = new Student();
		stu2.studentName = "관우";
		
		// FourthPackage.classpart2.Student@75a1cd57 : 패키지명.클래스명@주소값
		// 주소값을 해시코드(hash code)값이라고도 한다.
		
		System.out.println(stu1); // FourthPackage.classpart2.Student@75a1cd57
		System.out.println(stu2); // FourthPackage.classpart2.Student@515f550a
	}
}