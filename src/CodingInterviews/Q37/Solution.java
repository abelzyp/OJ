package CodingInterviews.Q37;

/*
 * 两个链表的第一个公共结点
 */
public class Solution {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null || pHead2 == null)
			return null;
		int len1 = getListLength(pHead1);
		int len2 = getListLength(pHead2);

		int lenDif = 0;
		if (len1 > len2) {
			lenDif = len1 - len2;
			while (lenDif > 0) {
				pHead1 = pHead1.next;
				lenDif--;
			}
		} else {
			lenDif = len2 - len1;
			while (lenDif > 0) {
				pHead2 = pHead2.next;
				lenDif--;
			}
		}
		while (pHead1 != pHead2) {
			pHead1 = pHead1.next;
			pHead2 = pHead2.next;
		}
		return pHead1;
	}

	private int getListLength(ListNode pHead) {
		int len = 0;
		ListNode node = pHead;
		while (node != null) {
			len++;
			node = node.next;
		}
		return len;
	}
}
