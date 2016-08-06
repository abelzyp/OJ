package CodingInterviews.Q49;

/*
 * 把字符串转换成整数
 * 		将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 */
public class Solution {
	public static int StrToInt(String str) {
		if (str == null || str.length() == 0)
			return 0;
		char[] chs = str.toCharArray();
		int fuhao = 0;
		if (chs[0] == '-')
			fuhao = 1;
		int sum = 0;
		for (int i = fuhao; i < chs.length; i++) {
			if (chs[i] == '+')
				continue;
			if (chs[i] < 48 || chs[i] > 57)
				return 0;
			sum = sum * 10 + chs[i] - 48;
		}
		return fuhao == 0 ? sum : -sum;
	}

	public static void main(String[] args) {
		System.out.println(Solution.StrToInt("-123"));
	}
}
