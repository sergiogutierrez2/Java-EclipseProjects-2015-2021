import java.util.PriorityQueue;

/**
This program simulates a print queue.
*/
public class PriorityQueueDemo
{
   public static void main(String[] args)
  {
    PriorityQueue<WorkOrder> q = new PriorityQueue<>();
    q.add(new WorkOrder(3, "Shampoo carpets"));
    q.add(new WorkOrder(7, "Empty Trash"));
    q.add(new WorkOrder(8, "Water Plants"));
    q.add(new WorkOrder(10, "Remove pencil sharpener shavings"));
    q.add(new WorkOrder(6, "Replace light bulb"));
    q.add(new WorkOrder(1, "Fix broken sink"));
    q.add(new WorkOrder(9, "Clean coffee maker"));
    q.add(new WorkOrder(2, "Order cleaning supplies"));
	   
    System.out.println(q.peek()); //prints Fix Broken Sink

    while (q.size() > 0)
    {
       System.out.println(q.remove());
    }
    
    
    PriorityQueue<String>todo = new PriorityQueue<>();
    todo.add("3 do homework");
    todo.add("1 see friends");
    todo.add("5 eat");
    todo.add("12 sleep");
    System.out.println(todo.remove());
    System.out.println(todo.peek());
    //1 see friends
   // 3 do homework (but on the next slide, the second item printed is 12 sleep)
   }
}