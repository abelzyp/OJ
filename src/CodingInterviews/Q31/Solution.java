package CodingInterviews.Q31;

/*
 * 连续子数组的最大和
 */
public class Solution {
	public int FindGreatestSumOfSubArray(int[] array) {
		if (array == null || array.length == 0)
			return 0;
		int max = Integer.MIN_VALUE;
		int cur = 0;
		for (int i = 0; i < array.length; i++) {
			cur += array[i];
			max = Math.max(cur, max);
			cur = cur < 0 ? 0 : cur;
		}
		return max;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println(solution.FindGreatestSumOfSubArray(array));
	}
}
