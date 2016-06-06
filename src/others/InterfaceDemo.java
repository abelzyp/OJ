package others;

interface AnimalTrain{
	public abstract void jump();
}
abstract class Bird implements AnimalTrain{
	public abstract void sing();
}
class BigBird extends Bird{
	public void jump(){
		System.out.println("bird can jump?");
	}
	public void sing(){
		System.out.println("i can sing");
	}
}
class Pig implements AnimalTrain{
	public void jump(){
		System.out.println("i can jump");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		AnimalTrain at = new Pig();
		at.jump();
		System.out.println("-----");
		Bird b = new BigBird();
		b.jump();
		b.sing();
		BigBird bb = (BigBird) b;
		bb.jump();
		bb.sing();
	}

}
