import java.util.LinkedList;
import java.util.ListIterator;

/**
Program demonstrates LinkedList Class
*/
  public class ListDemo
{
  public static void main(String[] args)
  {
    LinkedList<String> staff = new LinkedList<>();
    staff.addLast("Diana");
    staff.addLast("Harry");
    staff.addLast("Romeo");
    staff.addLast("Tom");

    //  | in the comments indicates the iterator position

    ListIterator<String> iterator = staff.listIterator(); //DHRT
    iterator.next();  //D|HRT
    iterator.next();  //DH|RT

    // Add more elements after second element, before third.

    iterator.add("Juliet"); //DHJ|RT
    iterator.add("Nina"); //DHJN|RT

    iterator.next();  //DHJNR|T

    // Remove last traversed element

     iterator.remove();  //DHJN | T

    //  Print all elements

    System.out.println(staff);
    System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
    
    iterator.previous();
    iterator.previous();
    iterator.remove();
    
    System.out.println(staff);
    System.out.println("Expected: [Diana, Harry, Nina, Tom]");
   
   }
}