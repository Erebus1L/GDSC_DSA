public class InersectionOfTwoLinkedList {
    class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null) return null;
            ListNode one = headA;
            ListNode two = headB;
            while(one!=two){
                one = one.next;
                two = two.next;
                if(one == null && two == null){
                    break;
                }
                if(one == null){
                    one = headB;
                }
                if(two == null){
                    two = headA;
                }
            }
            return one;       
        }
    }
}
