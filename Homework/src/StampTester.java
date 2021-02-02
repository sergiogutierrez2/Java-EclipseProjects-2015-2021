public class StampTester
{
   public static void main(String[] args)
   {
       Stamp name = new Stamp("Steven", "P", "Jobs");
       System.out.println(name.getFirst());
       System.out.println("Expected: Steven");
       System.out.println(name.getMiddleInitial());
       System.out.println("Expected: P");
       System.out.println(name.getLast());
       System.out.println("Expected: Jobs");
       System.out.println("Character count: " + name.characterCount());
       System.out.println("Expected: 11");

       System.out.println(name.getInitials());
       System.out.println("Expected: SPJ");
       
       name = new Stamp("Bill", "Gates");
       System.out.println(name.getFirst());
       System.out.println("Expected: Bill");
       System.out.println("Middle:" + name.getMiddleInitial());
       System.out.println("Expected: ");
       System.out.println(name.getLast());
       System.out.println("Expected: Gates");
       System.out.println("Character count: " + name.characterCount());
       System.out.println("Expected: 9");
       System.out.println(name.getInitials());
       System.out.println("Expected: BG");
   }
}