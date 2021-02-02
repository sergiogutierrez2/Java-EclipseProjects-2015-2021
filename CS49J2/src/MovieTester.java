

public class MovieTester {

	  public static void main(String[] args) 
	  {

         Movie a = new Movie ("hello", 1991);
         Movie b = new Movie ("hello", 1997);
         
    	 System.out.println("Movie a");
    	 System.out.println(a);
    	 
    	 System.out.println("Movie b");
    	 System.out.println(b);
    	 
    	 System.out.println("Are SolarSystem and LylatSystem equal? ");
    	 System.out.println(a.equals(b));
         
	}
}
