package others.PalindromeString;

import java.util.Scanner;

/*
 * 判断一个字符串输入一个字符之后能不能成为回文串
 */
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		while (sc.hasNext()) {
			x = sc.nextLine();
			System.out.println(isRevStr(x));
		}
	}

	private static boolean isRevStr(String x) {
		if (x == null || x.equals(""))
			return true;
		StringBuilder sb = new StringBuilder(x);
		for (int i = 0; i < sb.length(); i++) {
			sb.deleteCharAt(i);
			String temp = sb.toString();
			if (sb.reverse().toString().equals(temp)) {
				return true;
			} else {
				sb = new StringBuilder(x);
				continue;
			}
		}
		return false;
	}
}
