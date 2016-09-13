package WrittenExam.NetEase.AnHeiDeZiFuChuan;

import java.util.Scanner;

/*
 * 递推公式:f(n)=f(n-1)*2+f(n-2)
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dp = new long[n];
		dp[0] = 3;
		dp[1] = 9;
		for (int i = 2; i < dp.length; i++)
			dp[i] = dp[i - 1] * 2 + dp[i - 2];
		System.out.println(dp[n - 1]);
	}
}
