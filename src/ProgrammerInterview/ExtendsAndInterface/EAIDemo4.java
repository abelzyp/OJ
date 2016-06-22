package ProgrammerInterview.ExtendsAndInterface;

/*
 * 此题考查this
 * 		this关键字使用在一个成员函数的内部，指向当前对象，
 * 		当前对象指的是调用当前正在执行方法的那个对象。
 * 		super关键字是直接指向超类的构造函数，
 * 		用来引用超类中的变量或方法。
 */
public class EAIDemo4 {
	public static void main(String[] args) {
		Tester t = new Tester(5);
	}
}

class Tester {
	int var;

	Tester(double var) {
		this.var = (int) var;
	}

	Tester(int var) {
		this("hello");
	}

	Tester(String s) {
		this();
		System.out.println(s);
	}

	Tester() {
		System.out.println("good-bye");
	}
}