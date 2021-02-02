//import java.util.Arrays;

public class IntArrayProcessorTester
{
    public static void main(String[] args)
    {
        int[] list = {5, 3, 7, 1, 4, 7, 6};  
        IntArrayProcessor util = new IntArrayProcessor(list);
        
        int[] list2 = {-7, -2, -9, -4, -7, -6, -1, -5, -7};  
        IntArrayProcessor util2 = new IntArrayProcessor(list2);
        
        System.out.println("Max: " + util.getMax()); 
        System.out.println("Expected: 7");
        System.out.println("Max: " + util2.getMax());
        System.out.println("Expected: -1");

        util.swap(1, 10);
        util.swap(10, 1);
        util.swap(-1, 4);
        util.swap(4, -1);
        System.out.println(util.toString());
        System.out.println("Expected: [5, 3, 7, 1, 4, 7, 6]");
        util.swap(1, 3);
        System.out.println(util.toString());
        System.out.println("Expected: [5, 1, 7, 3, 4, 7, 6]"); 

        System.out.println("Display Sum: " + util.displaySum());
        System.out.println("Expected: 5+1+7+3+4+7+6=33");
       
    }
}
