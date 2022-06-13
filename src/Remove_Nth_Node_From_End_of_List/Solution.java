package Remove_Nth_Node_From_End_of_List;
// 19. Remove Nth Node From End of List

import java.util.List;

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
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    int nodeNo = 1;
    int rec = 0;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        NodeNo(head);

        if (nodeNo==n){
            head = head.next;
            return head;
        }
        if(nodeNo-n == 1){
            head.next = head.next.next;
            return head;
            // burda head.next.next null olabilir
        }
        if(nodeNo == 1){
            head = null;
            return head;
        }
        else{
            findPrevNode(head, n);
        }
        return head;

    }

    ListNode findPrevNode(ListNode head, int n){

        if(rec == nodeNo-n-1){
            head.next = head.next.next;
            return head;
        }
        rec++;
        return findPrevNode(head.next,n);
    }
    void NodeNo(ListNode head){
        while(head.next != null){
            nodeNo++;
            head = head.next;
        }
    }
}
