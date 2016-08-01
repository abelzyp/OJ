package CodingInterviews.Q08;

/*
 * 旋转数组的最小数字
 */
public class Solution {
	public int minNumberInRotateArray(int[] array) {
		if (array.length == 0)
			return 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[i + 1]) {
				return array[i + 1];
			}
		}
		return array[0];
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = { 3, 4, 5, 1, 2 };
		System.out.println(solution.minNumberInRotateArray(array));
	}
}
