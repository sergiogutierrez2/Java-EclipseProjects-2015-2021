package edu.princeton.cs.algs4;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;
import java.awt.Rectangle;
import java.io.*;
import java.util.*;

//1.1-1
/*public class QuizTemplate {
	 public static void main (String[] args)  
	    {  
   
  int x = 0;
   int [] a = new int [] {1, 2, 3, 4, 5};
   
   for (int i = 0; i < a.length; i ++) {
	   x += a[i] * a[i];
	   }

   System.out.println(x);   
    System.out.println(Arrays.toString(a));
   System.out.println(a.length);  
  } 
} */
//PRINTS:
//55
//5

//1.1-2
/*
public class QuizTemplate {
	 public static void main (String[] args)  
	    {  
  
		 int n = 4;
		 int k = 5;
		 int [][] a = new int [n][n];
		 for (int i = 0; i < n; i ++) {
			 for (int j = 0; j < n; j++) {
			 a[i][j] = (i > j)? 0 : k; //variable = (condition) ? expressionTrue :  expressionFalse;
			 }
		}
//return a
  System.out.println(Arrays.deepToString(a));
  
  System.out.println(a.length); 
  System.out.println(a[0].length);  
 } 
}*/

////1.1-3 
/*
public class QuizTemplate {
	
	public static int mystery (int a, int b) {
		
		if (b == 0) { return 0; }
		
		if (a == 0) { return mystery (b - 1, a); }
		
		return b + mystery (b, a - 1);
		
	}
	
	public static void main (String[] args)  
	{
		int a = 0;
		int b = 10;
		System.out.println(mystery (a, b));
		
		a = 10;
		b = 3;
		System.out.println(mystery (a, b));
	}
  } 

*/

//1.1-4
/*public class QuizTemplate {

		public static void main (String [] args ) {
			Scanner scan= new Scanner(System.in);
			String str=scan.nextLine();
			double r = Double.parseDouble(str);
			
			// double r = Double.parseDouble(str); //lmao didnt work, had to move on
			//double r = 3; //Not it original code, added to make this work
			double c = 2 * Math.PI * r;
			double a = Math.PI * r * r;
			//System.out.printf (" radius = %.2f, circumference = %.2f, area = %.2 f\n", r, c, a);
			System.out.println (r);
			System.out.println (c);
			System.out.println (a);
			}
  } */
//PRINT: INPUT 3
//3.0
//18.84955592153876
//28.274333882308138
/* public class QuizTemplate {

	public static void main (String [] args ) {
		String originalString = "Java";
		String copyString = originalString;
		copyString.replace("va", "ba");

		int originalInteger = 3;
		int copyInteger = originalInteger;
		copyInteger = 12;
		
		int[] originalArr = {1, 2, 3, 4};
		int[] copyArr = originalArr;
		copyArr[0] = 200;
		
		System.out.println (originalString);
		System.out.println (originalInteger);
		System.out.println (originalArr[0]);
		// System.out.println (a);
		}
} */

public class QuizTemplate {

	public static void main (String [] args ) throws ClassNotFoundException {

		Class rec = Rectangle.class;
		System.out.println (rec);
		Class rec2 = Class.forName("java.awt.Rectangle");
		System.out.println (rec2);
		Class rec3 = new Rectangle().getClass();
		System.out.println (rec3);
		}
} 
