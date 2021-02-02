import java.util.Scanner;
public class University
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the grade: ");
        String grade = in.nextLine().toLowerCase();
        
        //otro alumno hizo
        //String letterGrade = letterGrade.touppercase();
        //(letterGrade.equals("A")); then if else, and else statements
        
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String f = "f";
        
        if (grade.substring(0,1).equals(a))
        {
             System.out.println("Grade is a 4.0");
        }
        
        else if (grade.substring(0,1).equals(b))
        {
            System.out.println("Grade is 3.0");
        }
        
        else if (grade.substring(0,1).equals(c))
        {
            System.out.println("Grade is 2.0");
        }
        
        else if (grade.substring(0,1).equals(d))
        {
            System.out.println("Grade is a 1.0");
        }
        
        else if (grade.substring(0,1).equals(f))
        {
            System.out.println("Grade is a 0.0");
        }
        
        else
        {
            System.out.println("Grade is a -1.0");
        }
        
        in.close();
    }
}