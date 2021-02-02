public class StringsForAll
{
   public static void main(String[] args)
   {
      String word = "rates"; 
      System.out.println(word.length() * 4);
      System.out.println(word.toUpperCase());

      String changed = word.replace("s", "$");
      System.out.println(changed + " " + word);
      changed = changed.replace("r", "12");
      changed = changed.replace("a", "4");

      System.out.println(changed);
      System.out.println(word);
   }
}

//Output
//20
//RATES
//rate$ rates
//124te$
//rates