package CodingInterviews.Q24;

/*
 * 二叉搜索树的后序遍历序列
 * 		这个方法比较蠢，在OJ上运行超时
 */
public class Solution {
	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0)
			return false;
		// 先拿出来根节点
		int root = sequence[sequence.length - 1];
		// 找左子树
		int i = 0;
		for (; i < sequence.length - 1; i++) {
			if (root < sequence[i])
				break;
		}
		int[] leftSeq = new int[i];
		for (int n = 0; n < i; i++) {
			leftSeq[n] = sequence[n];
		}
		// 找右子树
		int j = 0;
		for (; j < sequence.length - 1; j++) {
			if (sequence[j] < root)
				return false;
		}
		int[] rightSeq = new int[sequence.length - i - 1];
		for (int n = 0; n < sequence.length - i - 1; n++) {
			rightSeq[n] = sequence[n + i];
		}
		return VerifySquenceOfBST(leftSeq) && VerifySquenceOfBST(rightSeq);
	}
}
