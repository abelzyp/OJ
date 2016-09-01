package JavaFoundation.InnerClass;

/*
 * 面试题：
 *		要求请填空分别输出30，20，10。
 *		
 *	注意：
 *		1:内部类和外部类没有继承关系。
 *		2:通过外部类名限定this对象
 *			Outer.this
 */
class Outerr {
	public int num = 10;

	class Inner {
		public int num = 20;

		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(new Outerr().num);// 方法一
			System.out.println(Outerr.this.num);// 方法二，更好
		}
	}
}

class InnerClassTest1 {
	public static void main(String[] args) {
		Outerr.Inner oi = new Outerr().new Inner();
		oi.show();
	}
}