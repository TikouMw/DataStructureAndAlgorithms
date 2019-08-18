public class DynamicStackArrayDemo{

    public static void main(String[] args){
        StackArrayDynamic<Integer> stack = new StackArrayDynamic<>(3);
        stack.push(15);
        stack.push(50);
        stack.push(500);
        System.out.println(stack.Size);
        stack.push(-500);
        System.out.println(stack.Size);
        System.out.println(stack.top);
    }

}