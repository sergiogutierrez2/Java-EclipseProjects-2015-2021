//HOMEWORK 13B

import java.util.Comparator;

public class CollegeWrestlerComparatorByWeight implements Comparator<CollegeWrestler>
{
     public int compare(CollegeWrestler w1, CollegeWrestler w2)
     { 
        return Double.compare(w1.getWeight(), w2.getWeight());
     }
}
