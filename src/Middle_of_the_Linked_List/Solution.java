package Middle_of_the_Linked_List;
// 876. Middle of the Linked List
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
public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    int nodeNo = 1;
    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        ListNode last = head;
        NodeNo(head);

        if(nodeNo == 1){
            return head;
        }
        else if(nodeNo == 2){
            return head.next;
        }

        if(nodeNo%2 == 0){
            while(last.next != null){
                if(last.next.next != null){
                    last = last.next.next;
                    mid = mid.next;
                }else{
                    break;
                }
            }
            return mid.next;
        }
        else{
            while(last.next != null){
                if(last.next.next != null){
                    last = last.next.next;
                    mid = mid.next;
                }else{
                    break;
                }
            }
            return mid;
        }
    }
    void NodeNo(ListNode head){
        while(head.next != null){
            nodeNo++;
            head = head.next;
        }
    }
}
