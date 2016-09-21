package WrittenExam.WuBa58.ZiFuChuanWeiZhi;

/*
 * 两个字符串A和B，找到字符串B中和字符串A的相同位置的不同字符组成的字符串。
 * 
 * A:abcde B:abxyz 返回xyz
 */
public class Main {
	public static void main(String[] args) {
		String a = "abcde";
		String b = "a123e123";
		System.out.println(find(a, b));
	}

	private static String find(String a, String b) {
		int len = Math.min(a.length(), b.length());
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (; i < len; i++) {
			if (a.charAt(i) != b.charAt(i)) {
				sb.append(b.charAt(i));
			}
		}
		if (b.length() >= i) {
			sb.append(b.substring(i));
		}
		return sb.toString();
	}
}
