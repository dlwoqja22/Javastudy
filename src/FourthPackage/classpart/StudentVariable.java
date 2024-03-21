package FourthPackage.classpart;

public class StudentVariable {

	public static void main(String[] args) {
		
		int StudentID;
		String StudentName;
		int grade;
		String address;
		
		StudentID = 12345;
		StudentName = "홍길동" ;
		grade = 4;
		address = "노원구";
		
		System.out.println("학번은? " + StudentID);
		System.out.println("이름은? " + StudentName);
		System.out.println("학년은? " + grade);
		System.out.println("주소는? " + address);
		
		//비효율적임
	}
}