package WrittenExam.eleme.JiaoHuanZiShu;

/*
 * 将二叉树中所有结点的左右子树相互交换
 */
public class Recursive {
	public void exchange(TreeNode node) {
		TreeNode tmp = null;
		if (node.left == null && node.right == null)
			return;
		else {
			tmp = node.left;
			node.left = node.right;
			node.right = tmp;
		}
		if (node.left != null)
			exchange(node.left);
		if (node.right != null)
			exchange(node.right);
	}
}
