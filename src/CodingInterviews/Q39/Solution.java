package CodingInterviews.Q39;

/*
 * 二叉树的深度
 */
public class Solution {
	public int TreeDepth(TreeNode pRoot) {
		if (pRoot == null)
			return 0;
		int left = TreeDepth(pRoot.left);
		int right = TreeDepth(pRoot.right);
		return (left > right) ? (left + 1) : (right + 1);
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node5.left = node7;
		node3.right = node6;
		Solution solution = new Solution();
		System.out.println(solution.TreeDepth(node1));
	}
}
