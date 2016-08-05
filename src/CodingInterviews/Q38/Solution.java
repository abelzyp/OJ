package CodingInterviews.Q38;

/*
 * 数字在排序数组中出现的次数
 */
public class Solution {
	public int GetNumberOfK(int[] array, int k) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (k == array[i])
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = { 1, 2, 3, 3, 3, 3, 4, 5 };
		System.out.println(solution.GetNumberOfK(array, 3));
	}
}
