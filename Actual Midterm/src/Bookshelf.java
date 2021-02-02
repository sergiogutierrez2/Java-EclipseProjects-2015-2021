import java.awt.print.Book;
import java.util.ArrayList;

public class Bookshelf 
{
	private ArrayList<Book> book;
	
	public Bookshelf ()
	{
		book = new ArrayList<Book>();
	}
	
	public void add(Book s)
	{	
		book.add(s);
	}
	
	public double getAveragePrice() 
	{
		if (book.isEmpty())
    	{return 0;}
    	
		double sum = 0;
    	
		for (int i = 0; i < book.size(); i++) 
		 { 		      
			 sum = sum + book.get(i).getPrice();
	      }   	
		return sum;	
	}
}
