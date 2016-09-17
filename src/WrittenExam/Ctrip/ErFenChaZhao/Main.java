package WrittenExam.Ctrip.ErFenChaZhao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(search(arr, x));
	}

	private static int search(int[] arr, int x) {
		if (arr == null || arr.length == 0)
			return -1;

		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high) >> 1;
		while (low <= high) {
			mid = (low + high) >> 1;
			if (arr[mid] == x)
				return mid;
			else if (arr[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1 - low;
	}
}
