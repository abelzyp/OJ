package WrittenExam.DiDi.CanGuan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] desks = new int[n];
		for (int i = 0; i < n; i++) {
			desks[i] = sc.nextInt();
		}
		Arrays.sort(desks);// 桌数排序完

		int[][] peoples = new int[m][2];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 2; j++) {
				peoples[i][j] = sc.nextInt();
			}
		}

		int maxMoney = 0;
		abel: for (int k = 0; k < n; k++) {
			int cur = 0;
			for (int i = 0; i < m; i++) {
				if (desks[k] >= peoples[i][0]) {
					cur = cur > peoples[i][1] ? cur : peoples[i][1];
				}
			}
			maxMoney += cur;
			for (int i = 0; i < m; i++) {
				if (cur == peoples[i][1]) {
					peoples[i][1] = 0;
					continue abel;
				}
			}
		}

		System.out.println(maxMoney);
	}
}
