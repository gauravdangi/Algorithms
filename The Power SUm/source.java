
package test;
import java.lang.*;
import java.util.*;
/*
 * @author Gaurav
 */
public class Test {
   
           
    public static int count(int X, int p,int n){
        int r = (int) Math.pow(n,p);
         if(X-r<0)
            return 0;
        if(X-r == 0)
            return 1;
        else
            return count(X-r,p,n+1) + count(X,p,n+1);
    }

    public static void main(String[] args) throws InterruptedException {
        //System.out.println((++a)+(a++)+(a++)+(++a));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        //System.out.println(Math.pow(n, p));
        System.out.println(count(n,p,1));
        
    }
    
}
