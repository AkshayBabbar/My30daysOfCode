import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int[] sum=new int[16];
        int i;
        int j;
        for( i=0; i < 6; i++){
            for(j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int h=0;
        for( i=0; i < 4; i++){
            for(j=0; j < 4; j++){
         
                    sum[h]=arr[i][j]+arr[i][j+1]+arr[i][j+2]
                                            +
                                        arr[i+1][j+1]
                                            +
                       arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

                    h++;
            }
        }
                        Arrays.sort(sum);
                        System.out.println(sum[15]);
    }
    
}
