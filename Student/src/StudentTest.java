
public class StudentTest {

	public static void main (String[] args)
	
	{
		Student Sergio = new Student("Sergio", 90); //create the object
		int extracredit = 10;

		System.out.println("Student name is: " + Sergio.getName());
		System.out.println("Student score is: " + Sergio.getTotalScore());
		Sergio.addScore(extracredit);  //decrease the price by the given percent
		
		System.out.println("Student new score is: " + Sergio.getTotalScore());
		
		//System.out.println(name + " " + price);
		//System.out.println("Expected: Laptop 495.0");
	}
	
}

