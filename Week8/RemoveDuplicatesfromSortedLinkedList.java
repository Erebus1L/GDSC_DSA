public class RemoveDuplicatesfromSortedLinkedList {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null)return null;
            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode curr = head;
            while(curr.next!=null){
                ListNode nex = curr.next;
                if(curr.val == nex.val){
                    curr.next = nex.next;
                }
                else{
                    curr = curr.next;
                }
            }
            return dummy.next;
        }
    }
}
