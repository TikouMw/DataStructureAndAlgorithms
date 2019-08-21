public class BubbleSort{

    public static void main(String[] args){
        // define array
        int[] numbers = {40,8,-9,10,-9,111,74,236,9,-8,10};
        boolean NoChange=false;
        int index, length=numbers.length-1, swap;
        // bubble Sort
        while(!NoChange){
            NoChange=true;
            for(index=0;index<length;index++)
                if(numbers[index]>numbers[index+1]){
                    swap = numbers[index+1];
                    numbers[index+1] = numbers[index];
                    numbers[index] = swap;
                    NoChange=false;
                }
        }
        // display
        for(int value:numbers)
            System.out.print(value+" ");
    }

}