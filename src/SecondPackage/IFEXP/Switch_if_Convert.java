package SecondPackage.IFEXP;

public class Switch_if_Convert {

	public static void main(String[] args) {
		
		
		int ranking = 1; // 1, 2, 3 기타 이외의 값
		char medalClolr;
				
				if(ranking == 1) {
					medalClolr = 'G';
				}else if(ranking == 2) { 
					medalClolr = 'S';
				}else if(ranking == 3) {
					medalClolr = 'B';
				}else {
					medalClolr = 'A';
				}	    
				System.out.println(ranking + "등 메달의 색깔은 " + medalClolr + "입니다.");
			}
		}
