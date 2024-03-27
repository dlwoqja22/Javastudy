package Chapter9.polymorphism;

// 부모 클래스 : super
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	
	// 재정의
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	// 추가
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	
	// 재정의
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	// 추가
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	
	// 재정의
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	// 추가
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

class Lion extends Animal {
	
	// 재정의
	@Override
	public void move() {
		System.out.println("사자가 뛰어 다닙니다.");
	}
	
	// 추가
	public void Eating() {
		System.out.println("사자가 사냥감을 먹습니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		// 다행성작업
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Human()); // 1)
		aTest.moveAnimal(new Tiger()); // 2)
		aTest.moveAnimal(new Eagle()); // 3)
		aTest.moveAnimal(new Lion()); // 4)
	}
	
	// 다행성 기능의 메서드 정의
	public void moveAnimal(Animal animal) {
		animal.move(); // animal = new Human() / new Tiger() / new Eagle() / new Lion()
	}
}