package CodingInterviews.Q47;

/*
 * 不用加减乘除做加法
 * 		写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Solution {
	public static int Add(int num1, int num2) {
		int XOR, ex;
		do {
			XOR = num1 ^ num2;
			ex = (num1 & num2) << 1;
			num1 = XOR;
			num2 = ex;
		} while (num2 != 0);
		return num1;
	}

	public static void main(String[] args) {
		System.out.println(Solution.Add(5, 17));
	}
}
