import java.util.Stack;

/**
This program simulates an undo stack
*/
public class StackDemo
{
   public static void main(String[] args)
  {
    Stack<String> commands = new Stack<>();
    commands.push("Insert 'Hello'");
    commands.push("Insert ','");
    commands.push("Insert ' '");
    commands.push("Insert 'World'");
    commands.push("Insert '?'");
    commands.push("Insert '?'");
    commands.push("Insert '!'");

    //Now we undo the last four commands
    for (int i = 1; i <= 4; i++)
    {
       String command = commands.pop();
       System.out.println("Undo " + command);
    }
    
    Stack<String> colors = new Stack<>();
    
    colors.push("red");
    colors.push("green");
    colors.push("blue");
    
    System.out.println(colors.pop());
    System.out.println(colors.peek());   
    System.out.println(colors);
    //Question 1 B is correct answer
   }
}