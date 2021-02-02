import java.util.*;

public class BoxTester {

    public static void main(String[] args) 
  {
    	//Box<int> box = new Box<>;
    	Box box = new Box<>();
    	//Box<Double> box = new Box<>();
    	//Box box = new Box<>();
    	//Box<E> box = new Box();
    	
        LinkedList<String> countries = new LinkedList<String>();
        countries.add("USA");
        countries.add("France");
        countries.add("Japan");
        countries.add("Australia");

        ListIterator<String> iterator = countries.listIterator();
        iterator.next();
        iterator.next();
        iterator.add("Russia");
        iterator.next();
        iterator.remove();

        System.out.println(countries);
  }
    
}