public class StackArrayDemo{

    public static void main(String[] args){
        StackArray<Integer> stack = new StackArray<>(5);
        stack.push(15);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.pop();
    }

}