package BeautifulCode;

import java.util.Date;

/*
 * super.getClass()得到的依然是runtime当前类，若要得到真正的父类，需要用super.getClass().getSuperclass()
 * 虽然这里写的是super，但其实用this也一样
 */
public class Code3 extends Date {
	private static final long serialVersionUID = 1L;

	private void test() {
		System.out.println(super.getClass().getName());
	}

	public static void main(String[] args) {
		new Code3().test();
	}
}
