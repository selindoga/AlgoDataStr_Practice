package Populating_Next_Right_Pointers_in_Each_Node;
// 116. Populating Next Right Pointers in Each Node

import java.util.ArrayList;

public class Solution {
    public Node connect(Node root) {
        if(root == null)
            return null;
        root.next = null;
        FindNode(root);
        return root;
    }
    void FindNode(Node root){
        if(root.left != null){
            root.left.next = root.right;
            FindNode(root.left);
            FindNode(root.right);
            if(root.left.left != null){
                root.left.right.next = root.right.left;
                if(root.left.right.right != null){
                    root.left.right.right.next = root.right.left.left;
                }
                FindNode(root.left.right);
                FindNode(root.left.left);
                FindNode(root.right.left);
                FindNode(root.right.right);
            }
        }
        // FindNode(root.left);
        //            FindNode(root.right);
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
