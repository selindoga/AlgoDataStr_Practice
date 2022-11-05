public class Test {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.AddNodeAtTail(1);
        a.AddNodeAtTail(2);
        a.AddNodeAtTail(3);
        a.AddNodeAtTail(4);
        a.AddNodeAtTail(5);
        a.AddNodeAtTail(6);
        a.DeleteAfterFirst_And_BeforeLast_AtTheSameTime();
        a.PrintTheList();
        System.out.println();

        //

        LinkedList b = new LinkedList();
        b.AddNodeAtTail(1);
        b.AddNodeAtTail(2);
        b.AddNodeAtTail(3);
        b.DeleteAfterFirst_And_BeforeLast_AtTheSameTime();
        b.PrintTheList();
        System.out.println();

        //

        LinkedList c = new LinkedList();
        c.AddNodeAtTail(1);
        c.AddNodeAtTail(2);
        c.DeleteAfterFirst_And_BeforeLast_AtTheSameTime();
        c.PrintTheList();
        System.out.println();

        //

        LinkedList d = new LinkedList();
        d.AddNodeAtTail(8);
        d.AddNodeAtTail(5);
        d.AddNodeAtTail(9);
        d.AddNodeAtTail(2);
        d.AddNodeAtTail(4);
        d.AddNodeAtTail(0);
        d.AddNodeAtTail(87);
        d.AddNodeAtTail(11);
        d.AddNodeAtTail(60);
        d.PrintTheList();
        System.out.println(d.GetDataAtGivenPosition(7, false));
        System.out.println(d.GetDataAtGivenPosition(4, true));
    }

}
