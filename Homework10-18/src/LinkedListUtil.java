//SOLUTION
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUtil
{
   public static void shrink(LinkedList<String> strings, int n)
   {
      if (strings.size() < n)
         return;
      
      ListIterator<String> iterator = strings.listIterator();
      int nodesSeen = 0;
      int size = strings.size();
      while (  size - nodesSeen >= n ) //if there are n nodes left
      {
         for (int count = 1; count <= n; count++)
         {
               iterator.next();
               nodesSeen++;
         }
         iterator.remove();    
      }
   }
   
   public static LinkedList<String>  reverse(LinkedList<String> strings)
   {
      LinkedList<String> reversed = new LinkedList<>();
      ListIterator<String> iterator = strings.listIterator();
      while(iterator.hasNext())
      {
         reversed.addFirst(iterator.next());
      }
      
      return reversed;
   }
}