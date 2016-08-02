package CodingInterviews.Q20;

import java.util.ArrayList;

/*
 * 顺时针打印矩阵
 */
public class Solution {
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		if (matrix.length == 0)
			return null;
		ArrayList<Integer> list = new ArrayList<>();
		int up = 0, down = matrix.length, left = 0, right = matrix[0].length;
		int sum = down * right;
		while (true) {
			// 从左到右
			for (int i = left; i < right; i++) {
				list.add(matrix[up][i]);
			}
			if (list.size() == sum)
				break;
			up++;
			right--;
			// 从上到下
			for (int i = up; i < down; i++) {
				list.add(matrix[i][right]);
			}
			if (list.size() == sum)
				break;
			right--;
			down--;
			// 从右到左
			for (int i = right; i >= left; i--) {
				list.add(matrix[down][i]);
			}
			if (list.size() == sum)
				break;
			down--;
			// 从下到上
			for (int i = down; i >= up; i--) {
				list.add(matrix[i][left]);
			}
			if (list.size() == sum)
				break;
			down++;
			left++;
			right++;
		}
		return list;
	}
}
