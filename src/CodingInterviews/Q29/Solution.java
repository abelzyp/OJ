package CodingInterviews.Q29;

import java.util.HashMap;

/*
 * 数组中出现次数超过一半的数字
 */
public class Solution {
	public int MoreThanHalfNum_Solution(int[] array) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			Integer temp = hashMap.get(array[i]);
			if (temp == null) {
				hashMap.put(array[i], 1);
				temp = 1;
			} else {
				hashMap.put(array[i], temp + 1);
			}
			if (temp + 1 > array.length / 2)
				return array[i];
		}
		return 0;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		// int[] array = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		// int[] array = { 1 };
		// int[] array = { 2, 1 };
		int[] array = { 1, 2, 3, 4 };
		System.out.println(solution.MoreThanHalfNum_Solution(array));
	}
}
