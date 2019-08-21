public class FibonacciSearch{

    public static void main(String[] args){
        //define array
        int[] numbers = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 
            34, 55, 89, 144, 233, 377, 610}; 
        //FibonacciSearch
        int SearchNumber = 21;
        Boolean isFound=false;
        int f0=0, f1=1, l = numbers.length;
        while(f1<300){f1 += f0; f0 = f1-f0;}
        /*if(numbers[f1] == SearchNumber) isFound=true;
        else if(numbers[f1-l] > SearchNumber){
            l = f1-l;
        }else
            /*if(f1>length) f1=length;
            if(numbers[f1] == SearchNumber || numbers[i] == SearchNumber){
                isFound=true;
                break;
            }
            else if(numbers[f1] > SearchNumber){
                for(int index=i;index<=f1&&index<=length;index++)
                    if(numbers[index] == SearchNumber){
                        isFound=true;
                        break;
                    }
                break;       
            }*/
        
        System.out.println("Found: "+isFound);
    }
}