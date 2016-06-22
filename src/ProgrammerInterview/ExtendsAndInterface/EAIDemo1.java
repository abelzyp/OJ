package ProgrammerInterview.ExtendsAndInterface;

/*
 * 此题考查继承和多态时构造函数执行顺序
 */
public class EAIDemo1 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		A a = new B();
		a = new A();
	}
}

class A {
	public static void prt() {
		System.out.println("1");
	}

	public A() {
		System.out.println("A");
	}
}

class B extends A {
	public static void prt() {
		System.out.println("2");
	}

	public B() {
		System.out.println("B");
	}
}