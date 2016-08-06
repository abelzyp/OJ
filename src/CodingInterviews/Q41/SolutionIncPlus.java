package CodingInterviews.Q41;

import java.util.ArrayList;

/*
 * 和为S的两个数字
 * 和Solution解法不同的地方是返回值不同
 * 		输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。 
 */
public class SolutionIncPlus {
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> list = new ArrayList<>();
		if (array == null || array.length == 0 || sum == 0)
			return list;
		int high = array.length - 1;
		int low = 0;
		while (high > low) {
			int curSum = array[high] + array[low];
			if (curSum == sum) {
				list.add(array[low]);
				list.add(array[high]);
				break;
			} else if (curSum > sum) {
				high--;
			} else {
				low++;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		SolutionIncPlus solutionIncPlus = new SolutionIncPlus();
		int[] array = { 1, 2, 4, 7, 11, 15 };
		int s = 15;
		System.out.println(solutionIncPlus.FindNumbersWithSum(array, s));
	}
}
