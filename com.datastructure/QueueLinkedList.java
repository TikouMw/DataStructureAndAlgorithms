public class QueueLinkedList<T>{

    NodeDouble<T> front, rear;

    public QueueLinkedList(NodeDouble head){
        this.rear = this.front = head;
    }

    public void Queue(NodeDouble node){
        rear.next = node;
        node.previous = rear;
        rear = node;
    }

    public T DeQueue(){
        if(front != null){
            T item = front.value;
            front = front.next;
            if(front != null) front.previous = null;
            return item;
        }
        return null;
    }

}