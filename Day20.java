import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int numberOfSwaps = 0;
        for(i = 0; i < n; i++)
        {
            for(int j = 0;j < n-1; j++)
            {
                if( a[j] > a[j+1] )
                {   numberOfSwaps++;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;                    
                }
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps+ " swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}
