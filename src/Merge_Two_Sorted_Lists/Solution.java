package Merge_Two_Sorted_Lists;

import java.util.List;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newlist = new ListNode();

        // 2 tane pointer oluşturucam
        // ikiside her iki listin başında olsun. Pointerların adı a ve b olsun
        // a ve b den hangisi küçükse ondan başla
        // if a < b ise: a yeni nod
        // sonra a ilerlesin (b de olabilirdi ama sadece 1 nodun ilerlemesi gerekiyor)
        // a pointer ı sağa sürekli gitmeye devam etsin ve değerini b ile karşılaştırmaya devam etsin
        // ve gidebildiği sürece de a'nın değeri yeni nod olmaya devam etsin
        // a sadece şu durumda gitmeyi durdursun: b'den büyükse yada bir sonraki nod yoksa (yani next null ise)
        // (ama eğer a nın sağ tarafı null ise o zaman b'nin tüm geri kalanı benim yeni nodlarım olur)

        ListNode a = list1;
        ListNode b = list2;
        ListNode head = newlist;

        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }

        while(a != null){
            if(b == null){
                newlist.next = a;
                return head.next;
                //return a;
            }
            else if(a.val < b.val){
                newlist.next = new ListNode(a.val);
                newlist = newlist.next;
                a = a.next;
            }
            else {
                newlist.next = new ListNode(b.val);
                newlist = newlist.next;
                b = b.next;
            }
        }
        if(a == null && b != null){
            newlist.next = b;
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}