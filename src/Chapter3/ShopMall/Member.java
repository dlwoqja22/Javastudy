package Chapter3.ShopMall;

//회원
public class Member {
	
	String name;
	String id;
	String pwd;
	int age;
	char gender; // 성별 M:남자 F:여자
	String zipcode;
	String addr;
	String hobby;

	void register(String name, String id, String pwd, int age, char gender, String zipcode, String addr, String hobby) {
		// 데이터 베이스에 회원정보를 삽입하는 구문
	}
	
	void edit(String name, String id, String pwd, int age, char gender, String zipcode, String addr, String hobby) {
		// 데이터 베이스에 회원정보를 수정하는 구문
	}
	
	void delete(String id, String pwd) {
		// 데이터 베이스에 회원정보를 삭제하는 구문
	}
	
	boolean login(String id, String pwd) {
		// 데이터 베이스에 아이디, 비밀번호 존재 유무를 체크해서 존재하면 true, 존재하지 않으면 false
		return true;	
	}
	
	//아이디 중복체크
	boolean idCheck(String id) {
		// 데이터 베이스에 아이디가 존재하지 않으면 사용가능 true, 존재하면 사용 불가능 false
		return true;	
	}
}