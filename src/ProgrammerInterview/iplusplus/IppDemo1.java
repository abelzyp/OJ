package ProgrammerInterview.iplusplus;

/*
 * i++
 */
public class IppDemo1 {
	static {
		// 在第一次被载入JVM时运行，但是由于是局部变量，x=5不影响后面的值
		int x = 5;
	}
	static int x, y;

	public static void main(String[] args) {
		x--;
		myMethod();
		System.out.println(x + y++ + x);
	}

	public static void myMethod() {
		y = x++ + ++x;
	}
}
