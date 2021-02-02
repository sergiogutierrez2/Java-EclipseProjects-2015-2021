import java.util.Arrays;
public class LotteryTester
{
   public static void main(String[] args)
   {
      Lottery generator = new Lottery();
      int [] numbers = generator.getCombination(5);
      System.out.println(Arrays.toString(numbers));
   }
}