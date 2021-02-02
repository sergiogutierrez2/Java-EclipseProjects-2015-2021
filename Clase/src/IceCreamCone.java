/**
 * Describes an ice cone
 */
public class IceCreamCone
{

    public static final double ONE_SCOOP_PLAIN_CONE = 1.75;
    public static final double ONE_SCOOP_WAFFLE_CONE = 2.50;  
    public static final double TWO_SCOOP_PLAIN_CONE = 2.25;
    public static final double TWO_SCOOP_WAFFLE_CONE = 2.75;
    public static final double THREE_SCOOPS_PLAIN_CONE = 4.25;
    public static final double THREE_SCOOPS_WAFFLE_CONE = 4.50;
    public static final int PLAIN_CONE = 1;
    public static final int WAFFLE_CONE = 2;
      
    private int scoops;
    private int type;
    
    public IceCreamCone( int numberOfScoops, int coneType)
    {
        this.scoops = numberOfScoops;
        this.type = coneType;
    }
    
    /**
     * Gets the cost of this IceCreamCone
     * @return the cost of this ice cream cone
     */
    public double getCost()
    {
        if (type == 1 && scoops == 1)
        {
             System.out.println("Grade is a 4.0");
        }
        
        else if (type == 1 && scoops == 2)
        {
            System.out.println("Grade is 3.0");
        }
        
        else if (type == 2 && scoops == 1)
        {
            System.out.println("Grade is 2.0");
        }
        
        else if (type == 2 && scoops == 2)
        {
            System.out.println("Grade is 2.0");
        }
        
        else
        {
            System.out.println("Grade is a -1.0");
        }
        
        return 0.0;
    }

}