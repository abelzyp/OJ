package WrittenExam.MeiTuan.PalindromeString;

import java.util.Arrays;
import java.util.Scanner;

//此题有瑕疵
/*
 * 对于一个字符串，可以通过删除某些字符变成回文字符串。
 * 要求：任意给定一个字符串，字符串最大长度1000，计算出最长的回文字符串长度。
 * 输入：cabbeaf
 * 输出：4
 */
public class Huiwenchuan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			int[] arr = new int[s.length()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = huiWenChuan(s.substring(i, s.length()));
			}
			Arrays.sort(arr);
			System.out.println(arr[arr.length - 1]);
		}
	}

	private static int huiWenChuan(String s) {
		int n = 0;
		for (int i = 0, j = s.length() - 1; i < j;) {
			if (s.charAt(i) == s.charAt(j)) {
				n++;
				i++;
				j--;
			} else {
				j--;
			}
		}
		if (n % 2 == 0) {
			return n *= 2;
		} else {
			return n = n * 2 + 1;
		}
	}
}
