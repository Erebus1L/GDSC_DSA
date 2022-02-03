
// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverse(slow.next);
        slow.next = temp;
        ListNode dummy = head;
        slow = slow.next;
        while(slow!=null){
            if(slow.val!=dummy.val){
                return false;
            }
            slow = slow.next;
            dummy = dummy.next;
        }
        return true;
        
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode curr = head;
        ListNode forw = head.next;
        while(forw!=null){
            curr.next = pre;
            pre = curr;

            curr = forw;
            forw = curr.next;
            
        }
        curr.next = pre;
        return curr;
    }
}