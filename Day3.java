import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         // Complete the code 
          if(n>20 && n%2 == 0)
          {   ans = "Not Weird";          }
          
          if((n>=2 && n<=5)&&(n%2==0)){
              ans = "Not Weird"  ;        }
          if((n>=6 && n<=20)&&(n%2 == 0)){
              ans = "Weird";
          }
      }
      System.out.println(ans);
   }
}