public class Student {
    private String Name;
    private int TotalScore;
    
    /*
     * Constructs a Product with the given price and name
     * @param theName the name of the student
     * @param theTotalScore of the student
     */
    public Student (String theName, int theTotalScore)
    {
    	Name = theName;
    	TotalScore = theTotalScore;
    }

    /*
     * Gets the total score of the student.
     * @return the TotalScore of the student.
     */
public int getTotalScore()
{
	return TotalScore;
}

/*
 * Gets the name of the Student
 * @return the name of the Student
 */
public String getName()
{
	return Name;
}

/*
 * Sets the name of the student.
 * @param theName the name of the student.
 */
public void SetName(String theName)
{
   Name = theName;
}

/*
 * Increases the price by the given percent
 * @param percent the percent to increase the price by
 */
public void addScore(int add)
{
	TotalScore = TotalScore + add; // check if this works		
}

}