public class Orca extends Whale {
    String diet;
    
    public Orca(String diet) {
    	super(3.0);
        this.diet = diet;
    }
    
    public Orca() {
    	super(3.0);
        this.diet = "Testing";
    }
    
   /* @Override
    public String toString()
    {
    return "Movie [Title = " + diet + ", Year = " + size + "]";
    }*/
}
