import java.util.ArrayList;
//import java.util.Collections;

public class Staff 
{
   private ArrayList<String> names;
   
   public Staff(ArrayList<String> names)
  {
   this.names = names;
  }
  
   public boolean equals(Staff other)
 {
     return names.equals(other.names);
 }
   
     public boolean sameContents(Staff other)
  {
   if (other.names.containsAll(names) && names.containsAll(other.names) )
       {
        return true;
       }
   else
   return false;
 }
 
   public void replaceVowelsWith(String text)
 {
   for(int i=0;i<names.size();i++)
 {
   names.set(i, names.get(i).replaceAll("[AaEeIiOoUuYy]", text));
  }
}

      public String mostVowels() 
      {
      if(names.isEmpty())
        return null;   
        
       int max = 0; 
       int count = 0;
       String name = null;
       for (String word : names) 
       {
           for (int i = 0; i < word.length(); ++i) 
           {
               char ch = Character.toLowerCase(word.charAt(i));
               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
               {
                   ++count;
               }
           }
           if(max < count) 
           {
               max = count;
               name = word;
           }
           count=0;
       }
       return name;
   }

   @Override
   public String toString() 
  {
    return names.toString();
  }
}