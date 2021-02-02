import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
Program demonstrates a mpa that maps to names to colors.
*/
  public class MapDemo
{
  public static void main(String[] args)
  {
    Map<String, Color> favoriteColors = new HashMap<>();
    favoriteColors.put("Juliet", Color.BLUE);
    favoriteColors.put("Romeo", Color.GREEN);
    favoriteColors.put("Adam", Color.RED);
    favoriteColors.put("Eve", Color.BLUE);

    Set<String> keySet = favoriteColors.keySet();
    for (String key : keySet)
    {
       Color value = favoriteColors.get(key);
       System.out.println(key + " : " + value);
     }
   }
}