package WrittenExam.NetEase.FenTianDi;

import java.util.Scanner;

/*
 * 找出n行m列矩形数组中最小的数
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp = 0;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			for (int j = m - 1; j >= 0; j--) {
				arr[i][j] = temp % 10;
				temp = temp / 10;
			}
		}

		int min = arr[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = m - 1; j >= 0; j--) {
				if (min > arr[i][j])
					min = arr[i][j];
			}
		}
		System.out.println(min);
	}
}
