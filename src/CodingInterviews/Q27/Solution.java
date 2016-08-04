package CodingInterviews.Q27;

/*
 * 二叉搜索树与双向链表
 */
public class Solution {
	TreeNode head = null;
	TreeNode realHead = null;

	public TreeNode Convert(TreeNode pRootOfTree) {
		SubConvert(pRootOfTree);
		return realHead;
	}

	private void SubConvert(TreeNode pRootOfTree) {
		if (pRootOfTree == null)
			return;
		SubConvert(pRootOfTree.left);
		if (head == null) {
			head = pRootOfTree;
			realHead = pRootOfTree;
		} else {
			head.right = pRootOfTree;
			pRootOfTree.left = head;
			head = pRootOfTree;
		}
		SubConvert(pRootOfTree.right);
	}
}
