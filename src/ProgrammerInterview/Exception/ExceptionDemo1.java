package ProgrammerInterview.Exception;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void test() {
		// throw new Exception("test");
		// 这句话有问题，在test()函数中单独throw一个异常却不加捕获是错误的
	}
}
