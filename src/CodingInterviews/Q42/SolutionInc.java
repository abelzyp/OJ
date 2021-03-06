package CodingInterviews.Q42;

/*
 * 左旋转字符串
 * 		汇编语言中有一种移位指令叫做循环左移（ROL），
 * 		现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 		对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 		例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 */
public class SolutionInc {
	public String LeftRotateString(String str, int n) {
		if (str == null || str.length() == 0)
			return "";
		if (n == 0 || n >= str.length())
			return str;
		StringBuilder sb = new StringBuilder();
		for (int i = n; i < str.length(); i++) {
			sb.append(str.charAt(i));
		}
		for (int i = 0; i < n; i++) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		SolutionInc solutionInc = new SolutionInc();
		String str = "abcdefg";
		int n = 2;
		System.out.println(solutionInc.LeftRotateString(str, n));
	}
}
