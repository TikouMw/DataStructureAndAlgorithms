public class LinkedList{

    Node head;

    public LinkedList(Node head){
        this.head = head;
    }

    //FIFO: First-In, First-Out
    public void add_fifo(Node node){
        Node par = head;
        while(par.next != null) par = par.next;
        par.next = node;
    }

    //LIFO: Last-In, First-Out
    public void add_lifo(Node node){
        node.next = head;
        head = node;
    }

    public void Display(){
        Node p = head;
        while(p!=null){
            System.out.println(p.value);
            p = p.next;
        } 
    }

}