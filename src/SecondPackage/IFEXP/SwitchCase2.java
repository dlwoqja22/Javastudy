package SecondPackage.IFEXP;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		
		// String 플러스 : 문자열 데이터를 관리할 때 사용합니다.
		// char 데이터 타입과는 다릅니다.
		String medal = "Gold";
		
		// switch문에 정수 변수만이 아니라 문자열 변수를 사용 할 수 있다. 
		switch(medal) {
		case "Gold":
		      System.out.println("금메달입니다.");
		      break;
		case "Silver":
	      System.out.println("은달입니다.");
	      break;
		case "Bronze":
	      System.out.println("동메달입니다.");
	      break;
	    default:
	    	System.out.println("메달이 없습니다.");
	    	break;
		}	
	}
}