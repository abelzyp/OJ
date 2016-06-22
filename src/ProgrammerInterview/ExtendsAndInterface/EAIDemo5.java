package ProgrammerInterview.ExtendsAndInterface;

/*
 * 程序流程是这样的：
 * 		在主函数中，首先执行new MyBase(),在这过程中，子类会首先调用父类的构造函数；
 * 		在父类的构造函数Base()中执行add()方法。
 * 		这里需要注意，这个add()方法由于是在新建MyBase对象时调用的，
 * 		将会首先查找MyBase类中是否有此方法，所以Base()函数中的add(1)实际上是调用了子类中的add()方法，
 * 		此时i的值为2。在打印两个2之后，父类构造函数执行完毕，执行子类的构造函数。
 */
public class EAIDemo5 {
	public static void main(String[] args) {
		go(new MyBase());
	}

	static void go(Base b) {
		b.add(8);
	}
}

class Base {
	int i;

	Base() {
		add(1);
		System.out.println("Base:" + i);
	}

	void add(int v) {
		i += v;
		System.out.println("BaseAdd:" + i);
	}
}

class MyBase extends Base {
	MyBase() {
		add(2);
		System.out.println("MyBase:" + i);
	}

	void add(int v) {
		i += v * 2;
		System.out.println("MyBaseAdd:" + i);
	}
}