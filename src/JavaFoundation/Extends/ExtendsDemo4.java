package JavaFoundation.Extends;

/*
 * 类的组成：
 *		成员变量：
 *		构造方法：
 *		成员方法：
 * 而现在我们又讲解了继承，所以，我们就应该来考虑一下，类的组成部分的各自关系。
 *
 * 继承中成员变量的关系:
 *		A:子类中的成员变量和父类中的成员变量名称不一样，这个太简单。
 *		B:子类中的成员变量和父类中的成员变量名称一样，这个怎么办?
 *			在子类方法中访问一个变量的查找顺序：
 *				a:在子类方法的局部范围找，有就使用
 *				b:在子类的成员范围找，有就使用
 *				c:在父类的成员范围找，有就使用
 *				d:如果还找不到，就报错。
 *
 * 问题是：
 *		我不仅仅要输出局部范围的num，还要输出本类成员范围的num。怎么办呢?
 *		我还想要输出父类成员范围的num。怎么办呢?
 *			如果有一个东西和this相似，但是可以直接访问父类的数据就好了。
 *			恭喜你，这个关键字是存在的：super。
 *			
 * this和super的区别?
 *		分别是什么呢?
 *			this代表本类对应的引用。
 *			super代表父类存储空间的标识(可以理解为父类引用,可以操作父类的成员)
 *
 *		怎么用呢?
 *			A:调用成员变量
 *				this.成员变量 调用本类的成员变量
 *				super.成员变量 调用父类的成员变量
 *			B:调用构造方法
 *				this(...)	调用本类的构造方法
 *				super(...)	调用父类的构造方法
 *			C:调用成员方法
 *				this.成员方法 调用本类的成员方法
 *				super.成员方法 调用父类的成员方法
 */
class Father1 {
	public int num = 10;
}

class Son1 extends Father1 {
	public int num = 20;

	public void show() {
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

class ExtendsDemo4 {
	public static void main(String[] args) {
		Son1 s = new Son1();
		s.show();
	}
}