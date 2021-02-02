import java.util.ArrayList;
import java.util.Collections;

class RacoonTester {
    public static void main(String[] args) {
         Racoon tally = new Racoon(true, 10, "Tally");
         Racoon josh = new Racoon(true, 14, "Josh");
         Racoon mila = new Racoon (true, 9, "Mila");

         ArrayList<Racoon> tailCompetition = new ArrayList<>();
         tailCompetition.add(tally);
         tailCompetition.add(josh);
         tailCompetition.add(mila);

         Collections.sort(tailCompetition, new TailComparator());

        for (Racoon r: tailCompetition) {
              System.out.println(r);
           }
       }
   }
        