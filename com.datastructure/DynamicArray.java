import java.util.Arrays;

public class DynamicArray<T>{
    Object[] data;
    int size, index;

    public DynamicArray(){
        size = 1;
        index = 0;
        data = new Object[1];
    }

    public T get(int index){
        return (T) data[index];
    }

    public void add(T element){
        if(ensurecapacity())
            data[index++]=element;
        else{ 
            size=size*2; // double size
            data=Arrays.copyOf(data,size);
            data[index++]=element;
        }
    }

    public boolean ensurecapacity(){
        return index < size;
    }
    
}