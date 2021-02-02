//Homework 15C

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Roster
{
   private LinkedList<Student> students;
   
   public Roster()
   {
      students = new LinkedList<>();
   }
   
   public void add(Student s)
   {
      ListIterator<Student> iterator = students.listIterator();
      
      boolean found = false;
      while (iterator.hasNext() && !found)
      {
         Student next = iterator.next();
         if (s.getName().compareTo(next.getName()) <= 0)
         {
            found = true;
         }
      }
      
      if (found) //check we are not at the head
      {
          iterator.previous();  //back up one
      }
      iterator.add(s);
   }
   
   public ArrayList<String> getNames()
   {
      ArrayList<String> names = new ArrayList<>();
      for (Student s : students)
      {
         names.add(s.getName());
      }
      
      return names;
   }
    
   public void remove(String name)
   {
      ListIterator<Student> iterator = students.listIterator();
      boolean found = false;
      while (iterator.hasNext() && !found)
      {
         Student next = iterator.next();
         if (next.getName().equals(name))
         {
            iterator.remove();
            found = true;
         }
      }
      
   }
}