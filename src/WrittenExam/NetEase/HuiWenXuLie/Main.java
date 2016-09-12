package WrittenExam.NetEase.HuiWenXuLie;

import java.util.Scanner;

/*
 * 此题没做出来
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] item = new int[n];
		for (int i = 0; i < n; i++) {
			item[i] = sc.nextInt();
		}
		if (isPalindrome(item)) {
			System.out.println(0);
			return;
		}

	}

	private static boolean isPalindrome(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - 1 - i])
				return false;
		}
		return true;
	}
}
