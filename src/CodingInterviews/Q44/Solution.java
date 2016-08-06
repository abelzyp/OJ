package CodingInterviews.Q44;

import java.util.Arrays;

/*
 * 扑克牌的顺子
 * 思路：
 * 		1、数组排序
 * 		2、统计0的个数
 * 		3、统计所有非零数之间除了差1之外到底差几
 * 			其中还判断一下有没有对子，如果有对子，一定不是顺子
 * 		4、判断0的个数够不够用
 */
public class Solution {
	public boolean isContinuous(int[] numbers) {
		if (numbers.length != 5)
			return false;
		Arrays.sort(numbers);
		int numOfZero = 0;
		for (numOfZero = 0; numOfZero < numbers.length; numOfZero++) {
			if (numbers[numOfZero] != 0)
				break;
		}
		int count = 0;
		for (int i = numbers.length - 1; i > numOfZero; i--) {
			if (numbers[i] == numbers[i - 1])
				return false;
			int countTemp = numbers[i] - numbers[i - 1];
			if (countTemp > 1)
				count = count + countTemp - 1;
		}
		if (numOfZero >= count)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numbers = { 1, 3, 2, 5, 4 };
		System.out.println(solution.isContinuous(numbers));
	}
}
