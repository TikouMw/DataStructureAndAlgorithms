public class JumpSearch{

    public static void main(String[] args){
        //define numbersay
        int[] numbers = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 
            34, 55, 89, 144, 233, 377, 610}; 
        
        //JumpSearch
        //The optimal value of m is √n
        int SearchNumber = 4;
        int index=0, length=numbers.length, m=(int) Math.sqrt(length);
        /* 
        STEP 1: Jump from index 0 to index 3;
        STEP 2: Jump from index 3 to index 6;....
        then Perform linear search from index 8 to get the element 55
        */
        Boolean isFound=false;
        while(!isFound){
            if(index>=length) index=length-1;
            if(numbers[index] == SearchNumber) {isFound=true;break;}
            else if(numbers[index]>SearchNumber){
                for(int i=index-m; i<index && i<length; i++)
                    if(numbers[i] == SearchNumber) {
                        isFound=true;
                        break;
                    }
                break;
            }
            index += m;
        }
        System.out.println("Found: "+isFound);
    }
}