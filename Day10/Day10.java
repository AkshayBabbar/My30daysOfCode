import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rem=0;
        int total=0;
        int binary=0;
                
        while(n>0){
         rem = n % 2;
         n = n / 2;
         if(rem==1)
         {    
                binary++;   
                
                 if(binary>total)
                         total=binary;
                }
         else
          {
                binary=0;     
          }
          }
        System.out.println(total);
        
    }
}
