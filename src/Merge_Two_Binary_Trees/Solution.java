package Merge_Two_Binary_Trees;
// 617. Merge Two Binary Trees
// my solution
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 != null && root2 != null){
            root1.val += root2.val;
            mergeTrees(root1.left, root2.left);
            mergeTrees(root1.right, root2.right);
        }
        if(root1 == null && root2 != null){
            root1 = new TreeNode(root2.val);
            mergeTrees(root1.left, root2.left);
            mergeTrees(root1.right, root2.right);
        }
        else if(root1 != null && root2 == null){
            return root1;
        }
        else if(root1 == null && root2 == null){
            return null;
        }
        return null;
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
