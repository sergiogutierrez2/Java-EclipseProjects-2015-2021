//HOMEWORK 17A
/*
Write a class StudentManager which uses a Map to associate students's names and their letter grades. Both the keys (names) and the values (letter grades) are Strings.

The constructor initializes an empty map.

public StudentManager()
Provide methods

public void add(String name, String grade) adds the student name and grade to the map
public void remove(String name) removes the association of this name and gpa
public int getClassSize() gets the number of students in the class
public String getPrintableRoster() gets the names of the students in alphabetical order and their grades in the format below
Anisa: A
Carlos: B+
James: A-
 */
import java.util.Map;
import java.util.TreeMap;

public class StudentManager
{
   Map<String, String> studentMap;
   public StudentManager()
   {
      studentMap = new TreeMap<>();
   }
   
   public void add(String name, String grade)
   {
      studentMap.put(name, grade);
   }
   
   public void remove(String name)
   {
      studentMap.remove(name);
   }
   
   public int getClassSize()
   {
       return studentMap.size();
   }
   
   public String getPrintableRoster()
   {
      String s = "";
      for (String name : studentMap.keySet())
      {
         s = s + name + ": " + studentMap.get(name) + "\n";
      }      
      return s;
   }
}