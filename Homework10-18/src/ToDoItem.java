//HOMEWORK 18B
public class ToDoItem implements Comparable
{
   private String description;
   private int priority;
    public ToDoItem(String item, int priority) 
    {
        this.description = item;
        this.priority = priority;
    }
    
    public String getDescription()
    {
       return description;
    }
    
    public int getPriority()
    {
       return priority;
    }
    
    @Override
    public boolean equals(Object otherObject)
    {
       if (otherObject == null) {return false;}
       if (this.getClass() != otherObject.getClass()) {return false;}
       ToDoItem other = (ToDoItem)otherObject;
       return priority == other.priority
             && description.equals(other.description);
    }
    
    @Override
    public String toString()
    {
       return getClass().getName() 
             + "[description=" + description 
             + ",priority=" + priority
             + "]";
    }
    
    public int compareTo(Object obj)
    {
        ToDoItem other = (ToDoItem)obj;
        if(Double.compare(this.priority, other.priority) != 0)
        {
            return Double.compare(this.priority, other.priority);
        }
        return this.description.compareTo(other.description); 
    }
    
}