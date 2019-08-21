public class FibonacciSearch{

    public static void main(String[] args){
        //define array
        int[] numbers = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 
            34, 55, 89, 144, 233, 377, 610}; 
         //FibonacciSearch
        int SearchNumber = 4;
        Boolean isFound=false;
        int i=0, j=1, length = numbers.length-1;
        while(j<=length){
            j += i;
            if(j>length) j=length;
            if(numbers[j] == SearchNumber || numbers[i] == SearchNumber){
                isFound=true;
                break;
            }
            else if(numbers[j] > SearchNumber){
                for(int index=i;index<=j&&index<=length;index++)
                    if(numbers[index] == SearchNumber){
                        isFound=true;
                        break;
                    }
                break;       
            }
            i = j;
        }
        System.out.println("Found: "+isFound);
    }
}