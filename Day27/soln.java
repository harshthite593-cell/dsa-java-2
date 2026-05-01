/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        int val;
        boolean sort = false;
        if(head == null){
            return head;
        }
        while(sort != true){
            if(temp.val > temp.next.val){
                temp.next = temp;
                temp = temp.next.next;
            }else{
                sort = true;
            }
        }
    }
}