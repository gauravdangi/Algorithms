 
import java.util.*;
 
/**
@author GauravSinghDangi
 */
class Farmer {
 
 
    public static void main(String[] args) {
        int len, bre,ans;
        int i,j;
        
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] arr = new int[t];
        if(t>0 && t<=20){
        for(i=0;i<t;i++)
        {
         len = scan.nextInt();
         bre = scan.nextInt();
         int a = (squa(len,bre));
         
         arr[i] = (len*bre/(a*a));
        }
        
        }
        else{
         System.exit(0);
        }
         for(i=0;i<t;i++){
          System.out.println(arr[i]);
         }
    }
 static int squa(int l,int b){
	
		int r;
	
		while(b!=0)
		{
			r=l%b;
			l=b;
			b=r;
			
		}
		return l;
	}   
}