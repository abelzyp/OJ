package WrittenExam.eleme.Triangle;

import java.util.List;

/*
 * 给定一个三角形，求得和最小的路径
 * 本题是LeetCode原题：120. Triangle
 */
public class Main {
	public int minimumTotal(List<List<Integer>> triangle) {
		for (int i = triangle.size() - 2; i >= 0; i--) {
			List<Integer> list = triangle.get(i);
			for (int j = 0; j < list.size(); j++) {
				int val = list.get(j);
				list.set(j, val + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
			}
		}
		return triangle.get(0).get(0);
	}
}
