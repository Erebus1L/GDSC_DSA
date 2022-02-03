public class ReverseLinkedList {
    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null) return head;
            ListNode curr = head;
            ListNode f = head.next;
            ListNode prev = null;
            
            while(f!=null){
                curr.next = prev;
                prev = curr;
                curr = f;
                f = curr.next;
            }
            curr.next = prev;
            return curr;
        }
    }
}
