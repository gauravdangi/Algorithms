
package anagramproblem;
import java.io.*;
import java.util.*;

/*
 * @author Gaurav
 */
public class AnagramProblem {
    
    public static int[] charCount(String str){
        int[] countArray = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int offset = (int)'a';
            int index = (int)ch - offset;
            countArray[index]++;
        }
        /*
         for(int i=0;i<26;i++){
            System.out.print(countArray[i]+" ");
        }
         System.out.println();
        */
        return countArray;
    }
    
    public static int Delta(int[] countFirst1, int[] countFirst2){
        int delta = 0;
        for(int i=0;i<26;i++){
            int diff = Math.abs(countFirst1[i] - countFirst2[i]);
            delta += diff;
        }
        return delta;
    }
    
    public static int noOfCharRemove(String str1, String str2){
        int[] count1 = charCount(str1);
        int[] count2 = charCount(str2);
        return Delta(count1,count2);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        System.out.println("Number of letters to be removed to make strings Anagram are : "
        +noOfCharRemove(first,second));
    }
    
}
