public class QueueArray<T>{

    Object[] ArrayQueue;
    int Front, Rear, Size;

    public QueueArray(int Size){
        this.Size = Size;
        ArrayQueue = new Object[Size];
        Front = Rear = -1;
    }
    
    public void Queue(T item){
        if(!isFull()){
            if(Front == -1){
                Front = Rear = 0;
                ArrayQueue[Rear] = item;
            }
            else
                ArrayQueue[++Rear] = item;
        }
    }

    public T DeQueue(){
        if(isEmpty()) return null;
        return (T) ArrayQueue[Front++];
    }

    public Boolean isFull(){
        return Rear == Size -1;
    }

    public Boolean isEmpty(){
        return Front == -1 || Front > Rear;
    }

}
