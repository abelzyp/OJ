package JavaFoundation.Abstract;

/*
 * 抽象类的成员特点：
 *		成员变量：既可以是变量，也可以是常量。
 *		构造方法：有。
 *					用于子类访问父类数据的初始化。
 *		成员方法：既可以是抽象的，也可以是非抽象的。
 *		
 *	抽象类的成员方法特性：
 *		A:抽象方法 强制要求子类做的事情。
 *		B:非抽象方法 子类继承的事情，提高代码复用性。
 */
abstract class Animal2 {
	public int num = 10;
	public final int num2 = 20;

	public Animal2() {
	}

	public Animal2(String name, int age) {
	}

	public abstract void show();

	public void method() {
		System.out.println("method");
	}
}

class Dog2 extends Animal2 {
	public void show() {
		System.out.println("show Dog");
	}
}

class AbstractDemo2 {
	public static void main(String[] args) {
		// 创建对象
		Animal2 a = new Dog2();
		a.num = 100;
		System.out.println(a.num);
		// a.num2 = 200;
		System.out.println(a.num2);
		System.out.println("--------------");
		a.show();
		a.method();
	}
}