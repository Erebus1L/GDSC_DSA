public class DeleteNodeinLinkedList {
    class Solution {
        public void deleteNode(ListNode node) {
          //  if(node==null)return;
            ListNode temp = node.next;
            node.val = node.next.val;
            node.next = temp.next;
        }
    }
}
