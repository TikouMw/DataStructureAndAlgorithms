public class BinarySearch{

    public static void main(String[] args){
        //define array
        int[] numbers = new int[100];
        for(int i=0;i<100;i++) numbers[i] = i+1;
        //Binary search
        int SearchNumber = 89;
        int low=0, mid=0, high=numbers.length-1;
        Boolean isFound=false;
        while(!isFound){
            if(low>high){
                System.out.println("number not found");
                break;
            }
            mid = low+((high-low)/2);
            if(numbers[mid] == SearchNumber) {isFound=true;break;}
            else if(numbers[mid]<SearchNumber) low=mid+1;
            else if(numbers[mid]>SearchNumber) high=mid-1;
        }
        System.out.println("Found: "+isFound);
    }

}