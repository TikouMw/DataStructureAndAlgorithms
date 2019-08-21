public class SelectionSort{

    public static void main(String[] args){
        // define array
        int[] numbers = {40,8,-9,10,-9,111,74,236,9,-8,10};
        int length=numbers.length-1, swap, min, index_min;
        // Selection Sort
        for(int i=0;i<length;i++){
            min = numbers[i];
            index_min=i;
            for(int j=i+1;j<=length;j++)
                if(numbers[j]<min){
                    min=numbers[j];
                    index_min=j;
                }
            if(min != numbers[i]){
                swap = numbers[i];
                numbers[i] = numbers[index_min];
                numbers[index_min] = swap;
            }
        }
        // display
        for(int value:numbers)
            System.out.print(value+" ");
    }
}