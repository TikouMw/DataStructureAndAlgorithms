public class DynamicArrayDemo{

    public static void main(String[] args){
        DynamicArray<Integer> darray = new DynamicArray<Integer>();
        darray.add(10);
        System.out.println("Size: "+darray.size);
        darray.add(100);
        System.out.println("Size: "+darray.size);
        darray.add(200);
        System.out.println("Size: "+darray.size);
        darray.add(400);
        System.out.println("Size: "+darray.size);
        darray.add(20450);
        System.out.println("Size: "+darray.size);
    }
}