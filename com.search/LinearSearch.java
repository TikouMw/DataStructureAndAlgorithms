public class LinearSearch{

    public static void main(String[] args){
        //define array
        int[] numbers = new int[100];
        for(int i=0;i<100;i++) numbers[i] = i+1;
        //linear search
        int SearchNumber = 89;
        for(int i=0;i<100;i++)
            if(numbers[i] == SearchNumber){
                System.out.println("number is found");
                System.out.println("Found after "+(i+1)+" tries");
                break;
            }
    }
}