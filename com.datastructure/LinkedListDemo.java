public class LinkedListDemo{

    public static void main(String[] args){
        LinkedList ls = new LinkedList(new Node<Integer>(7, null));
        ls.add_fifo(new Node<Integer>(10, null));
        ls.add_fifo(new Node<Integer>(5, null));
        ls.Display();
    }

}