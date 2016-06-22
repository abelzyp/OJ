package ProgrammerInterview.ExtendsAndInterface;

/*
 * 考查多态
 */
public class EAIDemo2 {
	public static void main(String[] args) {
		classB objectB = new classB();
		objectB.printValue();
		classA as = objectB;
		as.printValue();
		as = new classA();
		as.printValue();
	}
}

class classA {
	public void printValue() {
		System.out.println("classA");
	}
}

class classB extends classA {
	public void printValue() {
		System.out.println("classB");
	}
}