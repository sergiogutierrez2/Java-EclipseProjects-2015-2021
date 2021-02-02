package Samples;

import java.util.ArrayList;

public class Tester {

public static ArrayList<String> filterStringArray(String[] a, Filter f) {
ArrayList<String> temp = new ArrayList<>();
for (String s: a) {
    if (f.accept(s)) {
        temp.add(s);
      }
    }
    return temp;
}

	public static void main(String[] args) {
		String[] arrayToFilter = new String[] {"abc", "xyz", "longstring", "121212A"};

		ArrayList<String> longStrings = filterStringArray(arrayToFilter, new LongStringFilter());
		//print result
		for (int i = 0; i < longStrings.size();i++) 
	      { 		      
	          System.out.println(longStrings.get(i)); 		
	      }   
		ArrayList<String> stringsWithA = filterStringArray(arrayToFilter, new ContainsAFilter());
		//print result
		for (int i = 0; i < stringsWithA.size();i++) 
	      { 		      
	          System.out.println(stringsWithA.get(i)); 		
	      }   

		}
}
