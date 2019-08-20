public class BinarySearch{

    public static void main(String[] args){
        //define array
        int[] numbers = { 1, 3, 5, 10, 40, 55, 444, 988, 1000 };
        
        //Binary search
        int SearchNumber = 10050;
        int low=0, mid=0, high=numbers.length-1;
        Boolean isFound=false;
        while(!isFound){
            if(low>high) break;
            mid = low+((high-low)/2);
            if(numbers[mid] == SearchNumber) {isFound=true;break;}
            else if(numbers[mid]<SearchNumber) low=mid+1;
            else if(numbers[mid]>SearchNumber) high=mid-1;
        }
        System.out.println("Found: "+isFound);
    }

}