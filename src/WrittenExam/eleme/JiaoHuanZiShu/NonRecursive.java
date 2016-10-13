package WrittenExam.eleme.JiaoHuanZiShu;

import java.util.Stack;

public class NonRecursive {
	public void exchange(TreeNode node) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode p = null;
		if (node == null)
			return;
		stack.push(node);
		while (!stack.isEmpty()) {
			node = stack.pop();

			p = node.left;
			node.left = node.right;
			node.right = p;

			if (node.right != null)
				stack.push(node.right);
			if (node.left != null)
				stack.push(node.left);
		}
	}
}
