package JavaFoundation.InnerClass;

/*
 * 匿名内部类在开发中的使用
 */
interface Person {
	public abstract void study();
}

class PersonDemo {
	// 接口名作为形式参数
	// 其实这里需要的不是接口，而是该接口的实现类的对象
	public void method(Person p) {
		p.study();
	}
}

// 实现类
class Student implements Person {
	public void study() {
		System.out.println("好好学习,天天向上");
	}
}

class InnerClassTest2 {
	public static void main(String[] args) {
		// 测试
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		System.out.println("--------------------");

		// 匿名内部类在开发中的使用
		// 匿名内部类的本质是继承类或者实现了接口的子类匿名对象
		pd.method(new Person() {
			public void study() {
				System.out.println("好好学习,天天向上");
			}
		});
	}
}