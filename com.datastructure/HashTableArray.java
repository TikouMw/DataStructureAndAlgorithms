public class HashTableArray<T>{
    Entry[] arrayHash;
    int Size;

    public HashTableArray(int Size){
        this.Size = Size;
        arrayHash = new Entry[Size];
    }

    int getHash(int key){
        return key % Size;
    }

    public void put(int key, T value){
        Entry item = arrayHash[getHash(key)];
        while(item.next != null) item = item.next;
        item.next = new Entry<>(key, value);
    }

}
