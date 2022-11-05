public class Node {
    Node next;
    Node prev;
    int data;

    Node(int d){
        this.data = d;
        this.next = null;
        this.prev = null;
    }
    Node(int d, Node n, Node p){
        this.next = n;
        this.prev = p;
        this.data = d;
    }
}
