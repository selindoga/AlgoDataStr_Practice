public class LinkedList {
    Node head;
    Node tail;

    public void AddNodeAtTail(int value){
        LinkedList current = this; // burda bunu kullanan LinkedList i alıyorum
        Node neww = new Node(value);

        if(current.head == null){ // bu null ise tail de yok demek, yani node yok
            current.head = neww;
            current.tail = neww;
            return;
        }
        // node'umuz varsa LinkedList'e ekliyorum
        // tailin ilerisine ekliyorum

        // ilk yeni node'uma point eden referansları değiştirdim
        current.tail.next = neww; //tailin ilersine yeni node'umu koydum
        current.head.prev = neww; // headin gerisine yeni nodeumu koydum

        // yeni nodeumdan point edilenler
        neww.next = current.head; // yeni node'umun ilerisi head i gösteriyor
        neww.prev = current.tail; // node un gerisi taili gösteriyor

        // referaslarla işim bitince taili değiştirdim
        current.tail = neww; // yeni node um tail oldu
    }

    public int GetDataAtGivenPosition(int position, boolean isBackwards){ // 3.soru
        LinkedList cur = this;
        Node refHead = cur.head;
        Node refTail = cur.tail;
        int n = 0;

        if(!isBackwards){ // düz head den başlayarak arıyor
            if(position == 0){
                return refHead.data;
            }
            while(refHead.next != cur.tail){ // eğer head den sonraki ulaştığım yer tail ise tüm listeyi dolaştım
                if(n+1 == position){
                    return refHead.next.data;
                }
                n++;
                refHead = refHead.next; // referansımı ilerletiyorum ve listenin sonuna kadar gidiyorum
            }
            return -999; // eğer position indexi listenin dışındaysa, istenen node olmadığı için -999 döndürüyorum
        }

        else{ //tersten tail'den itibaren arıyor
            if(position == 0){
                return refTail.data;
            }
            while(refTail.prev != cur.head){ // eğer tail den ulaştığım en önceki yer head ise listeyi tamamladık
                if(n+1 == position){
                    return refTail.prev.data;
                }
                n++;
                refTail = refTail.prev;
            }
            return -999; // position indexi listede yok
        }
    }

    public void DeleteAfterFirst_And_BeforeLast_AtTheSameTime(){ // 2.soru
        // soruyu çözerken elimdeki listenin head ve tail olmayan headden sonraki ve tailden önceki node'larını sildim (aynı anda)
        // bu nedenle eğer 2 node ve az node varsa fonksiyon çalışmayacak
        // 3 node varsa en ortadaki silinecek
        // ve 4 node ve fazlası varsa normal şekilde çalışacak
        LinkedList cur = this;
        Node refHead = cur.head; // head referansı
        Node refTail = cur.tail; // taile referans

        if (cur.NoOfNodes() <= 2){
            return;
        }
        if(cur.NoOfNodes() == 3){
            cur.head.next = cur.tail;
            cur.tail.prev = cur.head;
            return;
        }

        // bu kodun aşağısı normal çalıştığı yer
        cur.head.next = cur.head.next.next; //headden point ettiğiimi değiştirdim
        cur.head.next.prev = cur.head; // sonrakini kendisine point ettim
        cur.tail.prev.prev.next = cur.tail; //ilk taile point ettim
        cur.tail.prev = cur.tail.prev.prev; //tailden point edileni değiştirdim
    }

    public int NoOfNodes(){
        LinkedList cur = this;
        Node refH = cur.head;

        if(refH == null){ // listede 0 node var
            return 0;
        }
        int n = 1; // head i saydım
        while(refH.next != cur.tail){ // taile kadar node'ları saydım
            n++;
            refH = refH.next;
        }
        n++; //taili de saydım
        return n;
    }

    public void PrintTheList(){
        LinkedList cur = this;
        Node ref = cur.head;

        while(ref.next != cur.tail){ // ilerisi taili gösterene kadar tüm node'ları dolaşıyor
            System.out.print(ref.data + " "); // ve print ediyor
            ref = ref.next;
        }

        // ilerisi tail olunca print etmeyi bıraktığı için ilerisi tail olan referansın kendisinin datasını ve tailin (ilerisinin) datasını print ediyorum
        System.out.print(ref.data + " " + cur.tail.data + "\n");
    }

}
