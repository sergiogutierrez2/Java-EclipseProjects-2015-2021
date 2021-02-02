/* LazyCritter.java */

  public class LazyCritter extends Critter 
{  
  boolean move = false;
  public LazyCritter(double d) 
  {
    super(d);
   }
  
public void move(int steps)
{
  if(!move)
{
  addHistory("eat");
  move = true;
}  
  else
 {
    addHistory("sleep");
    move = false;
  }
 }
}