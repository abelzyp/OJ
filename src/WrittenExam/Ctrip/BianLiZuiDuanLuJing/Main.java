package WrittenExam.Ctrip.BianLiZuiDuanLuJing;

import java.util.Scanner;

/*
	测试输入：
4
0,1,2,3
1,0,4,5
2,4,0,2
3,5,2,0

	输出：
5

	注：通过率33%
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] strs = str.split(",");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(strs[j]);
			}
		}
		int minPath = 0;
		int mmin = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < n; j++) {
				int tmp = Math.min(min, arr[i][j]);
				if (tmp > 0) {
					min = tmp;
				}
			}
			minPath += min;
			mmin = min < mmin ? min : mmin;
		}
		System.out.println(minPath - mmin);
	}
}
