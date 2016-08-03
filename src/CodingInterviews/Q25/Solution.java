package CodingInterviews.Q25;

import java.util.ArrayList;

/*
 * 二叉树中和为某一值的路径
 */
public class Solution {
	ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> dataList = new ArrayList<Integer>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null)
			return pathList;
		dataList.add(root.val);
		target -= root.val;
		if (target == 0 && root.left == null && root.right == null)
			pathList.add(new ArrayList<Integer>(dataList));
		FindPath(root.left, target);
		FindPath(root.right, target);
		dataList.remove(dataList.size() - 1);
		return pathList;
	}
}
