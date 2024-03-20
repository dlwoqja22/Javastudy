package SecondPackage.IFEXP;

public class SwitchCase {

	public static void main(String[] args) {
		
		int ranking = 1; // 1, 2, 3 기타 이외의 값
		char medalClolr;
		
		switch(ranking) {
		case 1: medalClolr = 'G'; // Gold
		break;
		case 2: medalClolr = 'S'; // Silver
		break;
		case 3: medalClolr = 'B'; // Blons
		break;
		default: // if문의 else와 유사하다.
			medalClolr = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalClolr + "입니다.");
	}
}