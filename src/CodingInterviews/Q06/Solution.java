package CodingInterviews.Q06;

/*
 * 重建二叉树
 */
public class Solution {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
		return root;
	}

	//											{...}		0			7			{...}		0			7
	private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
		if (startPre > endPre || startIn > endIn)
			return null;
		TreeNode root = new TreeNode(pre[startPre]);//pre[0]
		for (int i = startIn; i <= endIn; i++)
			if (in[i] == pre[startPre]) {
				//								{...}		1					3			{...}	0		2
				root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
				//								{...}				4				7	  {...}   4		7
				root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
			}
		return root;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		System.out.println(s.reConstructBinaryTree(pre, in).val);
	}
}
