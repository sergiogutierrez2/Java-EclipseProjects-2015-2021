import java.util.Random;
//returns an array of n random numbers less than 100
public class Lottery 
{
    public int[] getCombination(int n) 
    {
        int[] arr = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; ++i) 
        {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

}