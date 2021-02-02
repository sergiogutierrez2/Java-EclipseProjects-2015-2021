import java.util.Scanner;
public class City
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Where were you born? ");
        String city = in.nextLine().toLowerCase();
        
        if (city.equals("san francisco"))
        {
             System.out.println("You are not far from home.");
        }
        
        else
        {
            System.out.println("Where is that?");
        }
        
    }
}