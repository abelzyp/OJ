package CodingInterviews.Q45;

/*
 * 圆圈中最后剩下的数字
 */
public class Solution {
	public int LastRemaining_Solution(int n, int m) {
		if (n == 0 || m == 0)
			return -1;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
		}
		int i = -1;// 指向每次开始的起始数字
		int count = n;// 标记还剩几个数字
		int step = 0;// 记录走过的数
		while (count > 0) {
			i++;
			if (i == n)
				i = 0;// 再走就超过数组了，让它调头指向开始
			if (arr[i] == -1)
				continue;
			step++;
			if (step == m) {
				arr[i] = -1;
				step = 0;
				count--;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.LastRemaining_Solution(5, 3));
	}
}
