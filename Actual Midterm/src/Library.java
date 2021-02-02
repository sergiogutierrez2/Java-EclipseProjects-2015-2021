import java.awt.print.Book;
import java.lang.Object;

public class Library
{
	private Book[] book;
	
	public Library(Book[] book)
	{
		this.book = book;
	}
	
	public Book getLeastExpensive()
	{
		if (book.length < 1)
	   	{return null;}
		
    	Book smallest = book[0];
    	for (int i = 1; i < book.length; i++)
    	{
    	  if (book[i].getPrice() < smallest.getPrice())
    	   {
    	     smallest = book[i];
    	   }
    	}
    	return smallest;
	}
}
