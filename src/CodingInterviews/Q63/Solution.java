package CodingInterviews.Q63;

/*
 * 二叉搜索树的第k个结点
 * 		给定一颗二叉搜索树，请找出其中的第k大的结点。
 * 		例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
 */
public class Solution {
	int k;

	TreeNode KthNode(TreeNode pRoot, int k) {
		this.k = k;
		return helper(pRoot);
	}

	private TreeNode helper(TreeNode pRoot) {
		TreeNode temp = null;
		if (pRoot != null) {
			if ((temp = helper(pRoot.left)) != null)
				return temp;
			if (--k == 0)
				return pRoot;
			if ((temp = helper(pRoot.right)) != null)
				return temp;
		}
		return null;
	}
}
