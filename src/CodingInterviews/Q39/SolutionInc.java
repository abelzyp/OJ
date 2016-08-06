package CodingInterviews.Q39;

/*
 * Solution问题的递进版
 * 平衡二叉树
 */
public class SolutionInc {
	public boolean IsBalanced_Solution(TreeNode root) {
		if (root == null)
			return true;
		Solution solution = new Solution();
		int left = solution.TreeDepth(root.left);
		int right = solution.TreeDepth(root.right);
		int diff = left - right;
		if (diff > 1 || diff < -1)
			return false;
		return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
	}
}
