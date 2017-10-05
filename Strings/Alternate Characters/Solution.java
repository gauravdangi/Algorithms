import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isAlter(String str){
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i) != str.charAt(i+2))
                return false;
        }
        return true;
    }
    
    public static char[] getDistinct(String str){
        String s="";
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(!s.contains(String.valueOf(a)))
                s += a;
        }
        
        return s.toCharArray();
    }
    
    public static int check(char a,char b,String str){
        if(a == b){
            String s = str.replaceAll(String.valueOf(a), "");
           if(isAlter(s))
               return s.length();
           return -1;
        }
        
        else{
            String s = str.replace(String.valueOf(a), "");
            s = s.replace(String.valueOf(b), "");
            if(isAlter(s))
               return s.length();
           return -1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String str = in.next();
        
        if(len == 1){
            System.out.println(0);
            System.exit(0);
        }
               
        char[] arr = getDistinct(str.toString());
        if(arr.length == 1){
            System.out.println(str.length());
            System.exit(0);
        }
        
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int l = check(arr[i],arr[j],str);
                if(l >max)
                    max = l;
            }
        }
        
        if(max == -1){
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(max);
        
    }
}
