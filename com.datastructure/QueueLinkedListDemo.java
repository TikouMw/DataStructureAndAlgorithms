public class QueueLinkedListDemo{

    public static void main(String[] args){
        QueueLinkedList<Integer> Queue = new QueueLinkedList<>(new NodeDouble<Integer>(10, null, null));       
        Queue.Queue(new NodeDouble<Integer>(15, null, null));
        Queue.Queue(new NodeDouble<Integer>(30, null, null));
        Queue.Queue(new NodeDouble<Integer>(45, null, null));
        System.out.println(Queue.DeQueue()); 
        System.out.println(Queue.DeQueue()); 
        System.out.println(Queue.DeQueue());
        Queue.DeQueue();
        
    }

}