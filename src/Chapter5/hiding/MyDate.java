package Chapter5.hiding;

//접근자 4가지 유형
/*
 private : 접근이 막아져 있다.
 접근자 사용안함. default
 public
 
 protected
 
 private < default < public
 default 필드는 동일한 패키지 일 경우는 접근이되고, 다른 패키지에서는 접근이 안된다.
*/
public class MyDate {
	
	public int day;
	int month; // 접근자 생략시 default 의미.
	private int year;
	
}