package ProgrammerInterview.Exception;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void test() {
		try {
			throw new Exception("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
