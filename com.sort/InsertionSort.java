public class InsertionSort{

    public static void main(String[] args){
        // define array
        int[] numbers = {40,8,-9,10,-9,111,74,236,9,-8,10};
        int length=numbers.length-1, swap;
        // Insertion Sort
        for(int i=0;i<length;i++)
            for(int j=i+1;j<=length;j++)
                if(numbers[j]<numbers[i]){
                    swap = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = swap;
                }
        // display
        for(int value:numbers)
            System.out.print(value+" ");
    }
}