/**
 * This is an application that can determine the cost of a suite.  
 * @author Sergio Gutierrez
*/
     public class Suite 
    {
      private String view;
      private String season;
      private int occupants;
      
     /**
     * Constructs a Suite object.
     * @param view for the view.
     * @param season for the season.
     * @param occupants for the number of occupants.
     */
      public Suite(String view, String season, int occupants) 
      {
       this.view = view;
       this.season = season;
       this.occupants = occupants;
      }

     /**
     * Returns the cost of the Suite.
     * @return the cost
     */
      public double getCost() 
    {
       double cost = 0.0;

       if (occupants < 1)
       {
          cost = 0;
          return cost;
       }
       
       
       if (season.toUpperCase().equals("WINTER")) 
       {
         if (occupants < 3) 
         {
           if (view.toUpperCase().equals("STREET")) 
              {
                 cost = 150;
              }
           else 
              {
                 cost = 175;
              }
          }

        else if (occupants < 5)
        {
           if (view.toUpperCase().equals("STREET")) 
           {
              cost = 210;
           }

           else 
           {
              cost = 315;
           }
        }

       else 
       {
          cost = occupants * 200;
       }
    }

      else 
    {
       if (occupants < 3) 
       {
          if (view.toUpperCase().equals("STREET")) 
            {
               cost = 200;
            }
           else 
            {
              cost = 250;
            }
       }

     else if (occupants < 5)
     {
        if (view.toUpperCase().equals("STREET")) 
        {
           cost = 325;
        }
        else 
        {
          cost = 370;
        }
      }

     else 
     {
       cost = occupants*200;
     }
  }

     return cost;
  }

}