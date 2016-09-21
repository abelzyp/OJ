package WrittenExam.ShunFeng.JieMuGun;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			if (n < 0 || n > 64)
				continue;
			int[] arr = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			Arrays.sort(arr);
			int gcd = gcd(sum, n);
			if (arr[0] == arr[arr.length - 1]) {
				System.out.println(arr[0]);
			} else {
				System.out.println(arr[0] + arr[arr.length - 1]);
			}
			n = sc.nextInt();
		}
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
