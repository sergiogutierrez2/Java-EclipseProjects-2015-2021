//HOMEWORK 18B
import java.util.PriorityQueue;

public class ToDoList
{
   private PriorityQueue<ToDoItem> list;
    public ToDoList()
    {
       list = new PriorityQueue<>();
    }
    
    public void add(ToDoItem item)
    {
         list.add(item);
    }
    
    public ToDoItem nextItem()
    {   
         return list.remove();
    }
    
    public ToDoItem peek()
    {
       return list.peek();
    }
    
    public boolean hasNext()
    {
       return list.peek() != null;
    }
}