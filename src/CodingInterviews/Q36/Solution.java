package CodingInterviews.Q36;

/*
 * 数组中的逆序对
 */
public class Solution {
	public int InversePairs(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j])
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = { 7, 5, 6, 4 };
		System.out.println(solution.InversePairs(array));
	}
}
