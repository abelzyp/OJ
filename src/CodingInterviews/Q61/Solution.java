package CodingInterviews.Q61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 按之字形顺序打印二叉树
 * 		请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 		第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Solution {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (pRoot == null) {
			return result;
		}
		boolean leftToRight = true;
		Queue<TreeNode> layer = new LinkedList<TreeNode>();
		ArrayList<Integer> layerList = new ArrayList<Integer>();
		layer.add(pRoot);
		int start = 0, end = 1;
		while (!layer.isEmpty()) {
			TreeNode cur = layer.remove();
			layerList.add(cur.val);
			start++;
			if (cur.left != null) {
				layer.add(cur.left);
			}
			if (cur.right != null) {
				layer.add(cur.right);
			}
			if (start == end) {
				end = layer.size();
				start = 0;
				if (!leftToRight) {
					result.add(reverse(layerList));
				} else {
					result.add(layerList);
				}
				leftToRight = !leftToRight;
				layerList = new ArrayList<Integer>();
			}
		}
		return result;
	}

	private ArrayList<Integer> reverse(ArrayList<Integer> layerList) {
		int length = layerList.size();
		ArrayList<Integer> reverseList = new ArrayList<Integer>();
		for (int i = length - 1; i >= 0; i--) {
			reverseList.add(layerList.get(i));
		}
		return reverseList;
	}
}
