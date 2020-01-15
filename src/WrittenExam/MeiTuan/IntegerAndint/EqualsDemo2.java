package WrittenExam.MeiTuan.IntegerAndint;

/*
 * Tips:
 * 		1、包装类的“==”运算在不遇到算术运算的情况下不会自动拆箱
 * 		2、他们equals()方法不处理数据转型的关系
 */
public class EqualsDemo2 {
	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Integer e = 321;
		Integer f = 321;
		Long g = 3L;
		System.out.println(c == d);
		System.out.println(e == f);
		System.out.println(c == (a + b));
		System.out.println(e.equals(a + b));
		System.out.println(g == (a + b));
		System.out.println(g.equals(a + b));
	}
}
