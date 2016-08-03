package CodingInterviews.Q26;

/*
 * 复杂链表的复制
 */
public class Solution {
	public RandomListNode Clone(RandomListNode pHead) {
		Solution solution = new Solution();
		solution.CloneNodes(pHead);
		solution.ConnectRandomNodes(pHead);
		return solution.DevideNodes(pHead);
	}

	// 复制原始链表的任意结点N并创建新结点N',再把N'链接到N的后面
	private void CloneNodes(RandomListNode pHead) {
		RandomListNode pNode = pHead;
		while (pNode != null) {
			RandomListNode pCloned = new RandomListNode(pNode.label);
			pCloned.next = pNode.next;
			pCloned.random = null;

			pNode.next = pCloned;
			pNode = pCloned.next;
		}
	}

	// 复制random指向
	private void ConnectRandomNodes(RandomListNode pHead) {
		RandomListNode pNode = pHead;
		while (pNode != null) {
			RandomListNode pCloned = pNode.next;
			if (pNode.random != null) {
				pCloned.random = pNode.random.next;
			}
			pNode = pCloned.next;
		}
	}

	// 拆分链表
	private RandomListNode DevideNodes(RandomListNode pHead) {
		RandomListNode pNode = pHead;
		RandomListNode pClonedHead = null;// 仅做返回链表头标记用
		RandomListNode pClonedNode = null;
		if (pNode != null) {
			pClonedHead = pClonedNode = pNode.next;
			pNode.next = pClonedNode.next;
			pNode = pNode.next;
		}
		while (pNode != null) {
			pClonedNode.next = pNode.next;
			pClonedNode = pClonedNode.next;
			pNode.next = pClonedNode.next;
			pNode = pNode.next;
		}
		return pClonedHead;
	}
}
