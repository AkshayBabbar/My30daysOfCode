import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
             /* Declare second integer, double, and String variables. */
        int first=Integer.parseInt(scan.nextLine());
        double second=Double.parseDouble(scan.nextLine());

        String string1=scan.nextLine();
        //String string2=scan.nextLine();

        /* Read and save an integer, double, and String to your variables.*/
    
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + first);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d + second);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        System.out.println(s+ string1); 
        
        scan.close();
    }
}
