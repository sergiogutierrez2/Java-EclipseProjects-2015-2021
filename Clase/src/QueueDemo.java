import java.util.LinkedList;
import java.util.Queue;

/**
This program simulates a print queue.
*/
public class QueueDemo
{
   public static void main(String[] args)
  {
    Queue<String> jobs = new LinkedList<>();
    jobs.add("Joe: Expense Report #1");
    jobs.add("Cathy: Meeting Memo");
    System.out.println("Printing " + jobs.remove());
    jobs.add("Cathy: Purchase Order #1");
    jobs.add("Cathy: Meeting Memo");
    jobs.add("Joe: Expense Report #2");
    jobs.add("Joe: Weekly Report");
    System.out.println("Printing " + jobs.remove());
    jobs.add("Cathy: Purchase Order #2");

    while (jobs.size() > 0)
    {
       System.out.println("Printing " + jobs.remove());
    }
    
    
    Queue<String> line = new LinkedList<>();
    
    line.add("Bill");
    line.add("Maria");
    line.add("Jose");
    
    System.out.println(line.remove());
    System.out.println(line.peek()); //peek to print head
    //Answer Bill and Maria
    //English Paper, English Paper, Math Problem set 8 (C)
   }
}