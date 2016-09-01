package JavaFoundation.InnerClass;

/*
 * 匿名内部类面试题：
 *		按照要求，补齐代码
 *			interface Inter { void show(); }
 *			class Outer { //补齐代码 }
 *			class OuterDemo {
 *				public static void main(String[] args) {
 *					  Outer.method().show();
 *				  }
 *			}
 *			要求在控制台输出”HelloWorld”
 */
interface Interrr {
	void show();
	// public abstract
}

class Outerrr {
	// 补齐代码
	public static Interrr method() {
		// 子类对象 -- 子类匿名对象
		return new Interrr() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}

class OuterDemo {
	public static void main(String[] args) {
		Outerrr.method().show();
		/*
		 * 1:Outer.method()可以看出method()应该是Outer中的一个静态方法。
		 * 2:Outer.method().show()可以看出method()方法的返回值是一个对象。
		 * 		又由于接口Inter中有一个show()方法,所以我认为method()方法的返回值类型是一个接口。
		 */
	}
}