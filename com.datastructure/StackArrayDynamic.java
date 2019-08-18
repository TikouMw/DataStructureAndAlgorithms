import java.util.Arrays;
//to use Stack Linked List, use Linkedlist with lifo method 
public class StackArrayDynamic<T>{
    int Size, top;
    Object[] ArrayStack;

    public StackArrayDynamic(int Size){
        top = -1;
        this.Size = Size;
        ArrayStack = new Object[Size];
    }

    public void push(T item){
        if(Isfull()){
            Size *= 2;
            ArrayStack = Arrays.copyOf(ArrayStack, Size);
        }
        ArrayStack[++top] = item;
    }

    public T pop(){
        if(top != -1)
            return (T) ArrayStack[top--];    
        System.out.println("Stack is empty");
        return null;
    }

    public Boolean Isfull(){
        return top == Size - 1;
    }

}