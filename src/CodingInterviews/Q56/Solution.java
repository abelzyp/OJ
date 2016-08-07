package CodingInterviews.Q56;

/*
 * 链表中环的入口结点
 * 		一个链表中包含环，请找出该链表的环的入口结点。
 */
public class Solution {
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		ListNode meetingNode = MeetingNode(pHead);
		if (meetingNode == null)
			return null;
		// 获取环中结点数目
		int nodesInLoop = 1;
		ListNode p = meetingNode;
		while (p.next != meetingNode) {
			p = p.next;
			nodesInLoop++;
		}
		p = pHead;
		for (int i = 0; i < nodesInLoop; i++) {
			p = p.next;
		}
		ListNode pp = pHead;
		while (p != pp) {
			p = p.next;
			pp = pp.next;
		}
		return p;
	}

	// 在链表存在环的前提下找到一快一慢两个指针相遇的结点
	private ListNode MeetingNode(ListNode pHead) {
		if (pHead == null)
			return null;
		ListNode pSlow = pHead.next;
		if (pSlow == null)
			return null;
		ListNode pFast = pSlow.next;
		while (pFast != null && pSlow != null) {
			if (pFast == pSlow)
				return pFast;
			pSlow = pSlow.next;
			pFast = pFast.next.next;
		}
		return null;
	}
}
