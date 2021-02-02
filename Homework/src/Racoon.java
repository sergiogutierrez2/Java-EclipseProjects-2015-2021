import java.util.Comparator;

public class Racoon implements Comparable<Racoon> {
    private boolean isHungry;
    private int lengthOfTail;
    private String name;

    public Racoon(boolean isHungry, int lengthOfTail, String name)  {
    this.isHungry = isHungry;
    this.lengthOfTail = lengthOfTail;
    this.name = name;
    }

    public int getLengthOfTail() {
    return this.lengthOfTail;
    }
  
    @Override
    public int compareTo(Racoon o) {
    return this.name.compareTo(o.name);
   }

   @Override
   public String toString() {
   return this.name + " width tail = " + this.lengthOfTail;
   }
}

class TailComparator implements Comparator<Racoon> {
@Override
   public int compare(Racoon o1, Racoon o2) {
    return -(o1.getLengthOfTail() - o2.getLengthOfTail());
    }
}