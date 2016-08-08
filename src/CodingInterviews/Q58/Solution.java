package CodingInterviews.Q58;

/*
 * 二叉树的下一个结点
 * 		给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 		注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class Solution {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		TreeLinkNode pNext = null;
		if (pNode.right != null) {
			TreeLinkNode pRight = pNode.right;
			while (pRight.left != null) {
				pRight = pRight.left;
			}
			pNext = pRight;
		} else if (pNode.next != null) {
			TreeLinkNode pCur = pNode;
			TreeLinkNode pParent = pNode.next;
			while (pParent != null && pCur == pParent.right) {
				pCur = pParent;
				pParent = pParent.next;
			}
			pNext = pParent;
		}
		return pNext;
	}
}
