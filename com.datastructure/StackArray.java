public class StackArray<T>{
    int Size, top;
    Object[] ArrayStack;

    public StackArray(int Size){
        top = -1;
        this.Size = Size;
        ArrayStack = new Object[Size];
    }

    public void push(T item){
        if(!Isfull())
            ArrayStack[++top] = item;
        else
            System.out.println("Stack is full");
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