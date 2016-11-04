/*
Author Gaurav Dangi
 */
package sumsubset;
import java.util.*;

public class SumSubset {

    
    public static void main(String[] args) {
        SumSubset SS = new SumSubset();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array of integers");
        for(int i=0;i<n;i++){
         arr[i]=scan.nextInt();
        }
        
        System.out.println("Enter number");
        int num = scan.nextInt();
        System.out.println("\n\nSubset of '"+num+"' possible?\n ---->  "+SS.possible(arr,num));
        
        
        
    }
    
    public boolean possible(int[] arr,int num){
        int small = smallest(arr);
        if(check(arr,1)) return true;
        for(int i=0;i<arr.length;i++){
          if(check(arr,num%arr[i])) return true;
          else{
            if(num%arr[i]>small){
              if(check(arr,num%small)) return true;
            }
            else{
             if(check(arr,(small+num%arr[i]))) return true;
            }
          }
        }
        return false;
    }
    
    public static boolean check(int[] arr,int num){
     for(int i=0;i<arr.length;i++){
      if(arr[i]==num) return true;
     }
     return false;
    }
    
    public static int smallest(int[] num){
     int small = num[0];
     for(int i=1;i<num.length;i++){
      if(num[i]<small){
       small = num[i];
      }
     }
     return small;
    }
}
