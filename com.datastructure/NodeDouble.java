public class NodeDouble<T>{
    T value;
    NodeDouble<T> next, previous;

    public NodeDouble(T value, NodeDouble next,NodeDouble previous){
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}
