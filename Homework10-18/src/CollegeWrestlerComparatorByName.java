//HOMEWORK 13B
import java.util.Comparator;

 public class CollegeWrestlerComparatorByName implements Comparator<CollegeWrestler>
{
   public int compare(CollegeWrestler w1, CollegeWrestler w2)
   {
      
      return w1.getName().compareTo(w2.getName());
   }
}