import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your favorite color? ");
        String color1 = in.nextLine().toLowerCase();
        System.out.print("What is your second favorite color? ");
        String color2 = in.nextLine().toLowerCase();
        
        if (color1.equals("red") && color2.equals("blue") 
           || color1.equals("blue") && color2.equals("red"))
        {
             System.out.println("That's PURPLE");
        }
        
        else
        {
            System.out.println("Not Purple");
       }
        
        in.close();
    }
}