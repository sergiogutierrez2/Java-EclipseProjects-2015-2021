
public class ProductTestest {

	public static void main (String[] args)
	
	{
		Product thing = new Product("laptop", 500); //create the object
		double percent = 10;
		thing.reducePrice(percent);  //decrease the price by the given percent
		thing.increasePrice(percent);  //increase the price the given percent
		double price = thing.getPrice(); //get the price
		String name = thing.getName(); //get the name
		System.out.println(name + " " + price);
		System.out.println("Expected: Laptop 495.0");
	}
	
}
