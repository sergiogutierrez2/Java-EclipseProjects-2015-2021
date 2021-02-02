import java.util.ArrayList;

public class Flowers 
{
	public static void main(String[] args)
    {
		ArrayList<String> flowers = new ArrayList<String>();
		flowers.add("rose");
		flowers.add("violet");
		flowers.add("pansy");
		flowers.add("zinnia");
		
		flowers.add(flowers.size() - 1,"lavender");
		
		System.out.println(flowers);
		
		flowers.remove(1);
		
		for (int i = 0; i < flowers.size(); i++) 
		{ 		      
			String str = flowers.get(i);
			String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
			flowers.set(i,cap);		
	     }   
		
		System.out.println(flowers);
	
    }
}
