public class WorkOrder implements Comparable
{
   private int priority;
   private String description;

   /**
    Constructs a work order with a given priority and description
   */
   public WorkOrder(int aPriority, String aDescription)
   {
     priority = aPriority;
     description = aDescription;
   } 

    public String toString()
  {
    return "priority=" + priority + ", description=" + description;
  }

  public int compareTo(Object otherObject)
  {
   WorkOrder other = (WorkOrder) otherObject;
   if (priority < other.priority) { return - 1;}
   
   else if (priority > other.priority) 
   { return 1;}
   
   else {return 0;}
  }

}