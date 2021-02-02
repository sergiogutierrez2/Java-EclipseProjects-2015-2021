package Homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class Filtering {
    public static int[] filter(int[]a, Filter<Integer> f) {
// intialize resulting array
//calculate the size, how? or use arraylist
        ArrayList<Integer> list = new ArrayList<>();

// iterate through each element, testing it in Filter f
        for (int number : a) {
            if(f.accept(number)) {
                // means that accept method returns true for this number
                // put this number into resulting array
                list.add(number);
            }
        }
        int [] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
        // return resulting array, if it was an arraylist-> convert to plain array
    }

    public static String[] filter(String[]a, Filter<String> f) {
// intialize resulting array
//calculate the size, how? or use arraylist
        ArrayList<String> list = new ArrayList<>();

// iterate through each element, testing it in Filter f
        for (String s : a) {
            if(f.accept(s)) {
                // means that accept method returns true for this number
                // put this number into resulting array
                list.add(s);
            }
        }
        String [] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
        // return resulting array, if it was an arraylist-> convert to plain array
    }

  public static void main(String[]args) {
     int [] numbers = {-1, -2, 0, 1, 2, -3, 3, 7, -7};
     String [] words = {"NineStringsOne", "NineStringsTwo", "Three", "Four", "NineStringsFive", "Six", "Seven", "NineStringsEight", "Nine", "Ten"};

     int [] positiveNumbers = filter (numbers, x -> x >= 0);
     String [] longStrings = filter (words, x -> (x.length()) >= 9);

      System.out.println("Positive Numbers: " + Arrays.toString(positiveNumbers));
      System.out.println("Long Strings: " + Arrays.toString(longStrings));
  }
}
