package WrittenExam.NetEase.HuiWenXuLie;

import java.util.Scanner;

/*
 * 要变成回文，那么两端的值一定要相等，如果已经相等了，把他们移除了继续在剩余序列上操作；
 * 如果不等，只能把较小那端(因为没法把较大的值变小)的那个值加到相邻一个位置(等同于题设给的操作)
 * 因此，一直这样做下去就可以边记录操作次数即可。
 * 
 * 时间复杂度:O(n)
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] item = new int[n];
		for (int i = 0; i < n; i++) {
			item[i] = sc.nextInt();
		}
		int l = 0;
		int r = n - 1;
		int res = 0;
		while (l < r) {
			if (item[l] < item[r]) {
				item[l + 1] += item[l];
				l++;
				res++;
			} else if (item[l] > item[r]) {
				item[r - 1] += item[r];
				r--;
				res++;
			} else {
				l++;
				r--;
			}
		}
		System.out.println(res);
	}
}
