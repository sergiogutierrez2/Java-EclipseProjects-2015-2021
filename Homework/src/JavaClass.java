import java.util.ArrayList;

/**
*JavaClass which manages Student objects.
*/
public class JavaClass{

    private ArrayList<Student> students;

/**
*JavaClass constructor
*/
JavaClass()
{
   students = new ArrayList<Student>();
}

/**
*add method that adds students
* @param s Student s
*/
public void add(Student s) 
{
    students.add(s);
}

/**
*gets an ArrayList<String> containing the names of all the Students in this JavaClass.
* @return names
*/
public ArrayList<String> getStudents()
 {
  ArrayList<String> names = new ArrayList<String>();
  for(Student s: students) 
   {
    names.add(s.getName());
   }
   return names;
 }

/**
*gets the name of the first student in the JavaClass who has an average greater than the target or the empty string.
* @param target double target
* @return x
*/
public String hasAverageGreaterThan(double target) 
{
   boolean flag = true;
   String x = "";
   //double gpa = -1;
   for(int i = 0; flag && i < students.size() ; ++i) 
   {
     if(students.get(i).getAverage() > target) 
     {
      flag = false;
      x = students.get(i).getName();
     }
   }
  return x;
 }
 
 /**
*gets the Student with the highest average in this JavaClass or null there are no students
* @return y
*/
public Student bestStudent() 
{
   Student y = null;
   double gpa = -1;
   for(Student s: students) 
  {
    if(s.getAverage() > gpa) 
    {
     gpa = s.getAverage();
     y = s;
    }
  }
   return y;
}
 
  /**
  *toString method gets a string to represent the students using ArrayList's toString method
 * @return students.toString()
 */
  public String toString() 
 {
    return students.toString();
  } 
 
}