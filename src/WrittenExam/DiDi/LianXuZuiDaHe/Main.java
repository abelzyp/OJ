package WrittenExam.DiDi.LianXuZuiDaHe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxSum(arr));
	}

	public static int maxSum(int[] arr) {
		if (arr == null || arr.length == 0)
			return 0;
		int max = Integer.MIN_VALUE;
		int cur = 0;
		for (int i = 0; i != arr.length; i++) {
			cur += arr[i];
			max = Math.max(max, cur);
			cur = cur < 0 ? 0 : cur;
		}
		return max;
	}
}
