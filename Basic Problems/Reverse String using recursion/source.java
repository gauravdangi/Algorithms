
package reversestring;

/*
 * @author Gaurav
 */

// Reverse String using Recursion

public class ReverseString {


    public static void reverse(char[] str, int start, int end){
        if(start>=end)
            return;
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        reverse(str,start+1,end-1);   
    }
    
    public static void main(String[] args) {
        String str = "abcdxyz";
        char[] s = str.toCharArray();
        reverse(s,0,s.length-1);
        for(int i=0;i<s.length;i++)
            System.out.print(s[i]);
    }
    
}
