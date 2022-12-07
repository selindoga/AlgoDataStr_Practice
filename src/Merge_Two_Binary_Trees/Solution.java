package Merge_Two_Binary_Trees;
// 617. Merge Two Binary Trees
// my solution
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode nnode = null;


        if(root1 == null && root2 != null){
            return root2;
        }
        else if(root1 != null && root2 == null){
            return root1;
        }

        if(root1 != null && root2 != null){
            nnode = new TreeNode(root1.val+ root2.val);
            nnode.left = mergeTrees(root1.left, root2.left);
            nnode.right = mergeTrees(root1.right,root2.right);
        }
        return nnode;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
