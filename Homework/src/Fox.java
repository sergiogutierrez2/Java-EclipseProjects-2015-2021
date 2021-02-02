public class Fox implements Comparable<Fox> {
   int age;
   double weight;

   public Fox(int age, double weight)
{

this.age = age;
this.weight = weight;

}

@Override
public String toString () { 
	return "Fox with age = " + this.age + "and weight = " + this.weight;
}

@Override
public boolean equals(Object obj) { 
	if (obj instanceof Fox) {
		   Fox other = (Fox) obj;
		   return age == other.age && weight == other.weight;
		    }
		    return false;
}

@Override
public int compareTo(Fox o) {
   if(this.age > o.age)  {
      return 1;
    }
   else if (this.age < o.age)  {
     return -1;
   }
   else{
    if (this.weight > o.weight) {
    	return 1;
          }
         else if (this.weight < o.weight) {
         return -1;
         }
          else{
          return 0;
           }
   }
  }
}