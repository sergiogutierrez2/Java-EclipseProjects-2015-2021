//Homework 15C
/*
Write a class Roster that manages a LinkedList of Student objects. The Student objects are arranged alphabetically by name. 
You are given a Student class. Do not modify it.
The constructor for a Roster has no parameters but initializes an empty LinkedList of Students. The list is the instance variable.

Provide these methods:
add(Student s) adds the Student to the LinkedList. The Students are maintained in alphabetical order by name
remove(String name) removes the first Student with the given name
get Names() returns an ArrayList of Strings containing the names of all the Students
 */

   public class RosterTester
{
   public static void main(String[] arg)
   {
      Roster myClass = new Roster();
      
      System.out.println(myClass.getNames());
      System.out.println("Expected: []");
      
      myClass.remove("Thomas");
      System.out.println(myClass.getNames());
      System.out.println("Expected: []");
      
      myClass.add(new Student("Carlos", 3.85));
      myClass.add(new Student("Predeep", 3.55));
      myClass.add(new Student("Aman", 3.5));
      myClass.add(new Student("Amy", 3.95));
      myClass.add(new Student("Yen", 3.5));
      
      System.out.println(myClass.getNames());
      System.out.println("Expected: [Aman, Amy, Carlos, Predeep, Yen]");
      
      myClass.add(new Student("Predeep", 2.0));
      myClass.add(new Student("James", 3.6));
      
      System.out.println(myClass.getNames());
      System.out.println("Expected: [Aman, Amy, Carlos, James, Predeep, Predeep, Yen]");
      
      myClass.remove("Fred");
      myClass.remove("Predeep");
      System.out.println(myClass.getNames());
      System.out.println("Expected: [Aman, Amy, Carlos, James, Predeep, Yen]");
      
   }
}