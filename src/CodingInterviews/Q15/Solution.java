package CodingInterviews.Q15;

public class Solution {
	public ListNode FindKthToTail(ListNode head, int k) {
		if (head == null || k == 0)
			return null;
		ListNode pAhead = head;
		for (int i = 0; i < k - 1; i++) {
			if (pAhead.next != null) {
				pAhead = pAhead.next;
			} else {
				return null;
			}
		}
		ListNode pBehind = head;
		while (pAhead.next != null) {
			pAhead = pAhead.next;
			pBehind = pBehind.next;
		}
		return pBehind;
	}
}
