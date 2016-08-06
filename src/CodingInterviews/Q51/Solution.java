package CodingInterviews.Q51;

/*
 * 数组中重复的数字
 */
public class Solution {
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		if (numbers == null || length == 0)
			return false;
		for (int i = 0; i < length; i++) {
			if (numbers[i] < 0 || numbers[i] > length - 1)
				return false;
		}
		for (int i = 0; i < length; i++) {
			while (numbers[i] != i) {
				if (numbers[i] == numbers[numbers[i]]) {
					duplication[0] = numbers[i];
					return true;
				}
				int temp = numbers[i];
				numbers[i] = numbers[temp];
				numbers[temp] = temp;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		// int[] numbers = { 2, 3, 1, 0, 2, 5, 3 };
		// int length = 7;
		int[] numbers = { 2, 1, 3, 0, 4 };
		int length = 5;
		int[] duplication = new int[1];
		System.out.println(solution.duplicate(numbers, length, duplication));
	}
}
