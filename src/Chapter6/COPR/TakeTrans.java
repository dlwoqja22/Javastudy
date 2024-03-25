package Chapter6.COPR;

public class TakeTrans {
	
	public static void main(String[] args) {
		//2명의 학생 객체를 생성
		Student stuJames = new Student("James", 5000);
		Student stuTomas = new Student("Tomas", 10000);
		
		Bus bus = new Bus(100); //Bus 차량 번호
		stuJames.takeBus(bus);
		stuJames.showInfo(); // 버스 정보 출력
		
		Subway subwayGreen = new Subway("4호선"); 
		stuTomas.takeSubway(subwayGreen);
		stuTomas.showInfo();
	}
}