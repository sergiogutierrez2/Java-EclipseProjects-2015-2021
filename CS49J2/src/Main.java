public class Main{        
	public static class ClassA      
	{         
	   void print()        
	     {              System.out.println("This is ClassA");        
	    }     
	}     
	     
	public static class ClassB extends ClassA     
	{           
		@Override           
		void print()       
		{           
		System.out.println("This is ClassB");      
		  }   }
	
	public static void main(String[] args)
		{     ClassA sup = new ClassA();     ClassA sub = new ClassB();    sup.print();   sub.print();  }  }