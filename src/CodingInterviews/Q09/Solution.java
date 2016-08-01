package CodingInterviews.Q09;

import java.util.Scanner;

/*
 * 斐波那契数列
 */
public class Solution {
	public static int Fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		// 传统递归方法时间过不去
		// return Fibonacci(n - 1) + Fibonacci(n - 2);
		int num1 = 1, num2 = 0, res = 0;
		for (int i = 2; i <= n; i++) {
			res = num1 + num2;
			num2 = num1;
			num1 = res;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("输入斐波那契数列第几项：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Solution.Fibonacci(n));
	}
}
