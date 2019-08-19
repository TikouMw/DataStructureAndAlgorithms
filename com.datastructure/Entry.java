public class Entry<T> {
    int key;
    T value;
    Entry<T> next;

    public Entry(int key, T value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getkey(){
        return key;
    }

    public T getValue(){
        return value;
    }
    
}