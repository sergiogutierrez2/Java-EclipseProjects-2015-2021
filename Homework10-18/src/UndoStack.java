//HOMEWORK 18A
import java.util.Stack;

public class UndoStack
{
   private Stack<String> history;
   
   public UndoStack()
   {
      history = new Stack<String>();
   }
   
   public void add(String phrase)
   {
      history.push(phrase);
   }
   
   public String undo() 
   {
      if (history.size() > 0)
      {
         return history.pop();
      }
      else
         return null;
   }
   
   public void undoAll()
   {
      history.clear();
   }
}