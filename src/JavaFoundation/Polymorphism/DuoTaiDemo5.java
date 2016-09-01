package JavaFoundation.Polymorphism;

/*
 * ClassCastException:类型转换异常
 * 一般在多态的向下转型中容易出现
 */
class Animall {
	public void eat() {
	}
}

class Dogg extends Animall {
	public void eat() {
	}

	public void lookDoor() {
	}
}

class Catt extends Animall {
	public void eat() {
	}

	public void playGame() {
	}
}

class DuoTaiDemo5 {
	public static void main(String[] args) {
		// 内存中的是狗
		Animall a = new Dogg();
		Dogg d = (Dogg) a;

		// 内存中是猫
		a = new Catt();
		Catt c = (Catt) a;

		// 内存中是猫
		Dogg dd = (Dogg) a; // ClassCastException
	}
}