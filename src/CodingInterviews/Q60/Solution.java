package CodingInterviews.Q60;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 把二叉树打印成多行
 * 		从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class Solution {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (pRoot == null)
			return listAll;
		queue.offer(pRoot);// 根结点入队
		int toBePrinted = 1;// 当前层还没打印的节点数
		int nextLevel = 0;// 下一层结点数
		while (!queue.isEmpty() && toBePrinted > 0) {
			TreeNode node = queue.poll();
			list.add(node.val);
			toBePrinted--;
			if (node.left != null) {
				queue.offer(node.left);
				nextLevel++;
			}
			if (node.right != null) {
				queue.offer(node.right);
				nextLevel++;
			}
			// 如果当前层没有没打印的结点了
			if (toBePrinted == 0) {
				listAll.add(list);
				list = new ArrayList<Integer>();
				toBePrinted = nextLevel;
				nextLevel = 0;
			}
		}
		return listAll;
	}
}
