package Delete_the_Middle_Node_of_a_Linked_List;

// Definition for singly-linked list.

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    int totalNode = 1;
    int a;
    public ListNode deleteMiddle(ListNode head) {
        countTotalNodes(head);
        if(totalNode == 1) return null;
        a = totalNode/2;
        findMiddle(head);
        return head;
    }
    public ListNode findMiddle(ListNode head){
        if(a > 1){
            a--;
            findMiddle(head.next);
        }else{
            head.next = head.next.next;
        }
        return head;
    }
    public ListNode countTotalNodes(ListNode head){
        if (head.next != null){
            totalNode++;
            countTotalNodes(head.next);
        }
        return head;
    }
}
