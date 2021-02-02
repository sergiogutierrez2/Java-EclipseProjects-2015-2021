/*
 * Sergio Gutierrez
 * CS49J
 * 3/11/2020
 * This class resembles a stack data structure but with an ArrayList.
 */

import java.util.ArrayList;

public class MyStack
{
    private ArrayList<Integer> list;

/**     
* Initialize empty Stack data structure     
*/
     public MyStack()
    {
       list = new ArrayList<Integer>();
    }

     /**     
     * Check if the stack is empty     
     * @return true if stack is empty     
     */     
    public boolean isEmpty()
    {
         return list.isEmpty();
    }

    /**     
    * Number of elements in the stack
    * @return the size of the stack     
    */    
    public int getSize()
    {
    	if (list.isEmpty())
       	{return 0;}
    	return list.size();
    }

    /**     
    * Returns the top (last added) element in the stack without removing it
    * @return the top of the stack     
    */    
    public int peek()
    {
    	if (list.isEmpty())
       	{return 0;}
    	return(list.get(list.size() -1));
    }
    
    /**     
    * Returns and removes the top (last added) element from the stack      
    *@return the top of the stack     
    */    
    public int pop()        
    {
       	if (list.isEmpty())
       	{return 0;}
    	
    	int top;
        top = list.remove((list.size()- 1));
        return(top);  
    }

    /**     
    * Add a new element to the top (the end of the list) of the stack     
    * @param value element to be added     
    */    
    public void push(int value) 
    {
    	list.add(value);
    }
    
    @Override public String toString() 
    {        
    	return "stack: " + this.list.toString();    
    }
    
    public static void main(String[] args) 
  {
      MyStack stack = new MyStack();
              
      System.out.println(stack.isEmpty());
      System.out.println("Expected: true.");
      stack.push(5);
      stack.push(6);
      stack.push(3);
      stack.push(8);
      stack.push(9);
       
      System.out.println(stack.isEmpty());
      System.out.println("Expected: false.");       
      System.out.println(stack.peek());
      System.out.println("Expected: 9.");  
      System.out.println(stack.getSize());
      System.out.println("Expected: 5.");
      
      System.out.println(stack.pop());
      System.out.println("Expected: 9.");
      System.out.println(stack.pop());
      System.out.println("Expected: 8.");
      System.out.println(stack.pop());
      System.out.println("Expected: 3.");
      System.out.println(stack.peek());
      System.out.println("Expected: 6.");
      System.out.println(stack.getSize());
      System.out.println("Expected: 2.");
  }
}