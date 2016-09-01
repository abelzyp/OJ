package JavaFoundation.Extends;

/*
 * Java中继承的特点：
 * 		A:Java只支持单继承，不支持多继承。
 * 			有些语言是支持多继承，格式：extends 类1,类2,...
 * 		B:Java支持多层继承(继承体系)
 */
class GrandFather {
	public void show() {
		System.out.println("我是爷爷");
	}
}

class Fatherr extends GrandFather {
	public void method() {
		System.out.println("我是老子");
	}
}

class Sonn extends Fatherr {
}

class ExtendsDemo2 {
	public static void main(String[] args) {
		Sonn s = new Sonn();
		s.method(); // 使用父亲的
		s.show(); // 使用爷爷的
	}
}
