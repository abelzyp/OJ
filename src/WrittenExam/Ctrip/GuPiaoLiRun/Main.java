package WrittenExam.Ctrip.GuPiaoLiRun;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strs = str.split(",");
		int[] arr = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
		System.out.println(maxProfit(arr));
	}

	private static int maxProfit(int[] prices) {
		int len = prices.length;
		if (len <= 1)
			return 0;
		int res = prices[1] - prices[0];
		int min = prices[0];
		for (int i = 2; i < len; i++) {
			min = Math.min(prices[i - 1], min);
			if (res < prices[i] - min) {
				res = prices[i] - min;
			}
		}
		if (res < 0)
			return 0;
		else
			return res;
	}
}
