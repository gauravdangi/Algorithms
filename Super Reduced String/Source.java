import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(StringBuilder s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                s.delete(i-1,i+1);
                i=0;
            }
               
        }
        if(s.length() == 0)
            return "Empty String";
        else
            return s.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder(in.nextLine());
        String result = super_reduced_string(str);
        System.out.println(result);
    }
}
