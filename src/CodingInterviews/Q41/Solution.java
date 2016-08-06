package CodingInterviews.Q41;

/*
 * 和为S的两个数字
 */
public class Solution {
	public boolean FindNumbersWithSum(int[] array, int s) {
		boolean found = false;
		if (array == null || array.length == 0 || s == 0)
			return found;
		int high = array.length - 1;
		int low = 0;
		while (high > low) {
			int curSum = array[high] + array[low];
			if (curSum == s) {
				found = true;
				break;
			} else if (curSum > s) {
				high--;
			} else {
				low++;
			}
		}
		return found;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = { 1, 2, 4, 7, 11, 15 };
		int s = 15;
		System.out.println(solution.FindNumbersWithSum(array, s));
	}
}
