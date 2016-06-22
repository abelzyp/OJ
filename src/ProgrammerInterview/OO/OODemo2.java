package ProgrammerInterview.OO;

/*
 * 此题考查构造函数
 * 解析：
 * 		1、Z继承X，构造Z，则先构造X，进入X类运行Y y = new Y();输出"Y"
 * 		2、接着输出"X"
 * 		3、再次构造Y,输出"Y"
 * 		4、最后调用Z本身的构造函数，输出"Z"
 */
public class OODemo2 {
	public static void main(String[] args) {
		new Z();
	}
}

class X {
	Y y = new Y();

	X() {
		System.out.print("X");
	}
}

class Y {
	Y() {
		System.out.print("Y");
	}
}

class Z extends X {
	Y y = new Y();

	Z() {
		System.out.print("Z");
	}
}