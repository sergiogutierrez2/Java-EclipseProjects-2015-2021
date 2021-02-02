/* HOMEWORK18A
 * Write a simplified application to illustrate the use of an undo button for a word processor. 
 * It keeps a history of all items and allows the user to undo the last.

Write a class UndoStack.
Implement using a Stack of Strings. The constructor will create an empty Stack to keep the history.

A UndoStack has these methods:

public void add(String phrase) adds the phase to the history of the UndoStack
public String undo() removes the last thing added or null if there is nothing in the history to undo. 
Note that this method violates the rule that a method is not both a mutator and an accessor. 
Also trying to remove an item form an empty stack causes an exception
public void undoAll() removes all items from the history
 */
public class UndoStackRunner
{
   public static void main(String[] args)
   {
      UndoStack words = new UndoStack();
      words.add("Mary had a");
      words.add("tiny lamp");
      words.undo();
      words.add("little lamb.");
      words.add("I's ");
      words.undo();
      words.add("It's");
      words.add("fleece");
      words.add("was");
      words.add("white as snow.");
      
      String removed;
      while ((removed = words.undo()) != null)
      {
         System.out.println(removed);
      }

      words.add("End of story");
      words.undoAll();
      
      if ((words.undo()) == null)
      {
         System.out.println("Can not undo. History is empty.");
      }
   }

}