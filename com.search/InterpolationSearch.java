public class InterpolationSearch{

    public static void main(String[] args){
        //define numbersay
        int[] numbers = { 1, 3, 5, 10, 40, 55, 444, 988, 1000 };
        
        //InterpolationSearch
        int SearchNumber = 988;
        int low=0, pos, high=numbers.length-1;
        Boolean isFound=false;
        while(low <= high && SearchNumber >= numbers[low] && SearchNumber <= numbers[high]){
            pos = low +  (SearchNumber-numbers[low])*(high-low) / (numbers[high]-numbers[low]);
            if(numbers[pos] == SearchNumber) {isFound=true;break;}
            else if(numbers[pos]>SearchNumber)
                high = pos-1;
            else
                low = pos+1;
        }
        System.out.println("Found: "+isFound);
    }
}