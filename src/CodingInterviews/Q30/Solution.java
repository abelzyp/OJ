package CodingInterviews.Q30;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 最小的k个数
 */
public class Solution {
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (k > input.length)
			return list;
		Arrays.sort(input);
		for (int i = 0; i < k; i++) {
			list.add(input[i]);
		}
		return list;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] input = { 4, 5, 1, 6, 2, 7, 3, 8 };
		System.out.println(solution.GetLeastNumbers_Solution(input, 4));
	}
}
