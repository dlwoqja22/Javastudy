package SecondPackage.OP;

// 비트 이동 연산자 : <<, >>, >>>
public class OperationEx5 {

	public static void main(String[] args) {
		
		int num = 0B10000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		
		System.out.println(num >>> 2);
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}
}