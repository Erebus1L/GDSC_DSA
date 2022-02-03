public class RemoventhNodefromEnd {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next == null|| head == null) return null;
            ListNode temp = new ListNode();
            temp.next = head;
            ListNode fast = temp;
            ListNode slow = temp;
            for(int i=1; i<=n; i++){
                fast = fast.next;
            }
            while(fast.next!=null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return temp.next;
        }
    }
}
