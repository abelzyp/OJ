package ProgrammerInterview.ExtendsAndInterface;

/*
 * 此题输出两个Father，而不是Father和Child
 * 问题就出在两个静态getName()方法上，可以去掉static关键字再试试
 */
public class EAIDemo3 {
	public static void main(String[] args) {
		Father father = new Father();
		Father child = new Child();
		System.out.println(father.getName());
		System.out.println(child.getName());
	}
}

class Father {
	public static String getName() {
		return "Father";
	}
}

class Child extends Father {
	public static String getName() {
		return "Child";
	}
}