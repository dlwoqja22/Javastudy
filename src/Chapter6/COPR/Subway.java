package Chapter6.COPR;

//학생이 통학 운송 수단으로 사용한 지하철 - 지하철 호선, 인원수, 수입
public class Subway {

	public String lineNumber; // 버스 번호
	public int passengerCount; // 승객수
	public int money; // 버스 수입액
	
	//매게변수가 있는 생성자, 지하철 노선 초기화
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;		
	}
	
	//지하철에 승객을 태우는 기능
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	
	//지하철의 수입액과 승객 인원수 확인
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}