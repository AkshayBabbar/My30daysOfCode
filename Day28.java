import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String emailRegx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegx);
        List<String> list = new ArrayList();
        
        //Matcher m = p.matcher(myString);
        //if( m.find() ) {
        // Print the match
        //System.out.println( m.group() );
        for(int i = 0; i < N; i++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = pattern.matcher(emailID);
            if(m.find()){
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for(String name: list){
            System.out.println(name);
        }
    }
}
