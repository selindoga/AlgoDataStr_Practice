package BST;

public class Test {
    public static void main(String[] args) {
        BST happyBST = new BST();

        happyBST.parent = new Node(5);
        happyBST.parent.left = new Node(3);
        happyBST.parent.right = new Node(7);
        happyBST.parent.left.left = new Node(2);
        happyBST.parent.left.right = new Node(4);
        happyBST.parent.right.left = new Node(6);
        happyBST.parent.right.right = new Node(8);

        System.out.println("this given BST is real binary search tree: " + happyBST.CheckBST());
        System.out.println("print the BST in preorder traversal: ");
        happyBST.PrintPreorder();
        System.out.println("print the BST in postorder traversal: ");
        happyBST.PrintPostorder();
        System.out.println("print the BST in inorder traversal: ");
        happyBST.PrintInorder();
        happyBST.Insert(1);
        System.out.println("after adding a node to the BST, it is real binary search tree: " + happyBST.CheckBST());
        System.out.println("this BST has value 6: " + happyBST.SearchValue(6));

        System.out.println("the depth of this BST of node with value 1 is: " + happyBST.FindDepth(1));
    }
}
