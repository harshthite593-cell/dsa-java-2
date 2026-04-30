public class MiddleofLL {
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        ListNode p = head;
        while (f != null && f.next != null) {
            p = s;
            s = s.next;
            f = f.next.next;
        }
        p.next = p.next.next;
        return head;
    }
}
