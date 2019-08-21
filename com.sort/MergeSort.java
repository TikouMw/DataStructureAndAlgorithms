public class MergeSort{

    public static void MergeSort(int[] numbers, int l,  int r){
        MergeSort(numbers, l, (int) (l+r)/2);
        MergeSort(numbers, (int) (l+r)/2, r);
    }

    public static void main(String[] args){
        // define array
        int[] numbers = {40,8,-9,10,-9,111,74,236,9,-8,10};
        int length=numbers.length-1, swap;
        // MergeSort

    }
}