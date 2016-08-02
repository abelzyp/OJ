package CodingInterviews.Q14;

/*
 * 调整数组顺序使奇数位于偶数前面
 */
public class Solution {
	public void reOrderArray(int[] array) {
		if (array.length == 0)
			return;
		int p1 = 0;
		int p2 = array.length - 1;
		while (p1 < p2) {
			while (p1 < p2 && (array[p1] % 2) != 0) {
				p1++;
			}
			while (p1 < p2 && (array[p2] % 2) == 0) {
				p2--;
			}
			if (p1 < p2) {
				int tmp = array[p1];
				array[p1] = array[p2];
				array[p2] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		Solution solution = new Solution();
		solution.reOrderArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
