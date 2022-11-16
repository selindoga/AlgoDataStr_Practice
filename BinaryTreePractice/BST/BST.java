package BST;

public class BST {
    Node parent;

    private void PrintPreorder(Node parent){
        System.out.println(parent.data);
        if(parent.left != null){
            PrintPreorder(parent.left);
        }
        if(parent.right != null){
            PrintPreorder(parent.right);
        }
    }
    public void PrintPreorder(){
        PrintPreorder(this.parent);
    }

    private void PrintInorder(Node parent){
        if(parent.left != null){
            PrintInorder(parent.left);
        }
        System.out.println(parent.data);
        if(parent.right != null){
            PrintInorder(parent.right);
        }
    }
    public void PrintInorder(){
        PrintInorder(this.parent);
    }

    private void PrintPostorder(Node parent){
        if(parent.left != null){
            PrintPostorder(parent.left);
        }
        if(parent.right != null){
            PrintPostorder(parent.right);
        }
        System.out.println(parent.data);
    }
    public void PrintPostorder(){
        PrintPostorder(this.parent);
    }

    //searches whether the given value is in the BST or not
    private boolean SearchValue(int value, Node parent){
        if(value == parent.data){
            return true;
        }
        if(value < parent.data){
            if(parent.left != null){
                return SearchValue(value, parent.left);
            }
            else return false;
        }
        else if(value > parent.data){
            if(parent.right != null){
                return SearchValue(value, parent.right);
            }
        }
        return false;
    }
    public boolean SearchValue(int value){
        return SearchValue(value, this.parent);
    }

    // this checks whether the given BST is a real binary search tree
    private boolean CheckBST(Node root,int max,int min){
        if(root == null){
            return true;
        }
        if(root.data < min || root.data > max){
            return false;
        }
        return CheckBST(root.left, root.data,min) && CheckBST(root.right, max, root.data);
    }
    public boolean CheckBST(){
        return CheckBST(this.parent, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    // this inserts a new node to the BST with a given value
    // I do not recommend using it for the newly created BST because it does not balance itself
    private void Insert(int value, Node parent){
        if(value == parent.data) return;
        if(value < parent.data){
            if(parent.left != null){
                Insert(value, parent.left);
            }
            else {
                Node neww = new Node(value);
                parent.left = neww;
            }
        }
        else{
            if(parent.right != null){
                Insert(value, parent.right);
            }
            else{
                Node neww = new Node(value);
                parent.right = neww;
            }
        }
    }
    public void Insert(int value){
        Insert(value, this.parent);
    }

    private int i = 0;
    private int FindDepth(int ValueOfNode, Node root){
        if (root == null) return 0;
        if(ValueOfNode == root.data){
            return i;
        }
        if(ValueOfNode < root.data){
            if(root.left != null){
                ++i;
                return FindDepth(ValueOfNode, root.left);
            }
        }
        else{
            if(root.right != null){
                ++i;
                return FindDepth(ValueOfNode, root.right);
            }
        }
        return i;
    }
    public int FindDepth(int ValueOfNode){
        return FindDepth(ValueOfNode, this.parent);
    }
}
