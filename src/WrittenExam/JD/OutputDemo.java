package WrittenExam.JD;

/*
 * 输出结果是？
 */
public class OutputDemo {
	public static OutputDemo o1 = new OutputDemo();
	{
		System.out.println("blockA");
	}
	static {
		System.out.println("blockB");
	}

	public static void main(String[] args) {
		OutputDemo o2 = new OutputDemo();
	}
}
