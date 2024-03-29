package Chapter14.generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// 제너릭 클래스를 사용. 객체 생성
		GenericPrinter<Power> powerPrinter = new GenericPrinter<Power>();
		powerPrinter.setMaterial(new Power());
		Power power = powerPrinter.getMaterial();
		System.out.println(powerPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(powerPrinter);
	}
}