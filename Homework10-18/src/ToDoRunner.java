//HOMEWORK 18B
/*
 In this problem you will do a better implementation of the to do list. 
 Write a class ToDoList that maintains a priority queue to manage the items to be done.
Write a class ToDoItem. ToDoItem has a description and a priority. The constructor takes these as parameters in that order.

ToDoItem implements Comparable interface and has these methods

get methods(accessors) for priority and description
equals method. Two items are equal if and only if they have both the same priority and description
compareTo method orders by priority. If priorities are equal, order by description.
toString returns a String representation of the ToDoItem in this format:
ToDoItem[description=see friends,priority=1]
Write the class ToDoList. Its constructor initializes an empty PriorityQueue.

ToDoList has these methods

public void add(ToDoItem item) Adds an item for this ToDoList
public ToDoItem nextItem() removes and returns the next item to do. (The one with the priority closest to 1). 
Note that this also violates the rule about mutators not returning values
public boolean hasNext() returns true if there is at least one item left to do otherwise false
public ToDoItem peek() returns the next item to do but does not remove it from the list
 */
public class ToDoRunner
{
     public static void main(String[] args)
     {
        ToDoList todo = new ToDoList();
        todo.add(new ToDoItem("sleep", 12));
        todo.add(new ToDoItem("study", 3));
        todo.add(new ToDoItem("see friends", 1));
        todo.add(new ToDoItem("eat", 5));
        todo.add(new ToDoItem("watch a movie", 4));
        todo.add(new ToDoItem("eat", 5));
        todo.add(new ToDoItem("see a movie", 3));
        System.out.println("hasNext: " + todo.hasNext());
        System.out.println("peek when queue has an item: " + todo.peek());
        
        //remove and print
        System.out.println("Remove all items  and print:");
        while(todo.hasNext())
        {
            System.out.println(todo.nextItem());
        }
        
        System.out.println("peek when queue is empty: " + todo.peek());
        System.out.println("hasNext: " + todo.hasNext());
     }
}