package CodingInterviews.Q03_FindInPartiallySortedMatrix;

/*
 * 二维数组中的查找
 * 		选择从左下脚开始搜寻的话，如果大于就向右，如果小于就向下
 */
public class Solution {
	public static boolean Find(int[][] array, int target) {
		// 定位到二维数组的最后一行、第一列上
		int row = array.length - 1;
		int col = 0;
		while ((row >= 0) && (col < array[0].length)) {
			if (array[row][col] < target) {
				col++;
			} else if (array[row][col] > target) {
				row--;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		int target = 7;
		System.out.println(Solution.Find(array, target) ? "找到" : "没找到");
	}
}
