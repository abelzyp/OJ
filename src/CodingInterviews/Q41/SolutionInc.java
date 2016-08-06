package CodingInterviews.Q41;

import java.util.ArrayList;

/*
 * 和为S的连续正数序列
 */
public class SolutionInc {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
		if (sum < 3)
			return listAll;
		int small = 1;
		int big = 2;
		int middle = (sum + 1) / 2;
		int curSum = 3;
		while (small < middle) {
			while (curSum < sum) {
				big++;
				curSum += big;
			}
			if (curSum == sum) {
				ArrayList<Integer> list = new ArrayList<>();
				for (int i = small; i <= big; i++) {
					list.add(i);
				}
				listAll.add(list);
			}
			curSum -= small;
			small++;
		}
		return listAll;
	}
}
