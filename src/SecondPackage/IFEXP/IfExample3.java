package SecondPackage.IFEXP;

// 다중 if문 : 조건식이 여러개 일 경우
public class IfExample3 {

	public static void main(String[] args) {
		
		//변수 선언시 초기값을 주거나 아니면 코드내에서 변수가 조건에 의하여 값을 가지도록 코딩을 해야합니다.
		int age = 9; // 나이
		int charge = 0;  // 입장료
		
		//아래 다중if문에서 조건식이 성립이 안되어 charge 변수가 값을 갖지 못하는 경우는 에러가 발생합니다.
		
		if(age >= 0 && age < 8) {
			charge = 1000;
		    System.out.println("아동입니다.");
		}else if(age >= 8 && age < 14) { 
			charge = 2000;
		    System.out.println("초등학생입니다.");
		}else if(age >= 14 && age < 20) {
			charge = 2500;
		    System.out.println("중,고등학생입니다.");
		}else if(age >= 20) {
			charge = 3000;
		    System.out.println("일반인입니다.");
		}
		System.out.println("입장료는" + charge + "원입니다.");
	}
}