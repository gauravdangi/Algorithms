package radixsort;

public class RadixSort {
    int matrix[][] = new int[10][10];
    final int INF = -99999;
    
    // --------------------- initialize matrix ---------------------------
    public void init(){
     // fill matrix with -9999
        for(int i=0;i<10;i++){
         for(int j=0;j<10;j++)
             matrix[i][j] = INF; //-9999 will be considered as NULL
             
        }
    }
    
    // ------------------- adding num into matrix -----------------------
    public void addInto(int row, int num){
     for(int j=0;j<10;j++){
      if(matrix[row][j]==INF){
          matrix[row][j] = num;
          break;
      }
     }
    }
    
    int getmax(int[] arr){
     int max=0,l=arr.length;
     int p=10,q=1,i=0;
     while(i<l){
      int r = arr[i]%p;
      int a = r/q;
      if(a>0){
       max=max+1;
       p*=10;
       q*=10;
      }
      else
          i++; 
     }
     return max;
    }
    
    // ----------------- sort() method -------------------------------
    public int[] sort(int arr[], int m, int n){
        init();
        int l = arr.length;
        // fill matrix
        for(int i=0;i<l;i++){
         int r = arr[i]%m;
         int k = r/n;
         addInto(k,arr[i]);
        }
       
        // Now retrieve values from matrix
        int flag = 0;
        int[] out = new int[l];
        for(int i=0;i<10;i++){
         for(int j=0;j<10;j++){
           if(matrix[i][j]!=INF){
            out[flag] = matrix[i][j];
           // System.out.println(flag+" -> "+out[flag]);
            flag++;
           }
           else{}
         }
        }
        /*
        System.out.print("\nOutput array: ");
        for(int i=0;i<out.length;i++){
      System.out.print(out[i]+" ");
      }*/
        return out;
    }
    
    // ----------------- radixSort() method -------------------------------
    public int[] radixSort(int arr[], int key){
    int i=0;
    int m=10,n=1;
    while(i<key){
     System.out.println("\n"+(i+1)+" time running");
     arr = sort(arr,m,n);
     m*=10;
     n*=10;
     i++;
    }
    return arr;
    }
   
    // ---------------------- main() method ---------------------------------
    public static void main(String[] args) {
      RadixSort sort = new RadixSort();
      int[] array = {10,15,1,60,5,101,1001,100,999,25,50};
      System.out.print("Array: ");
      for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
      }
      
      int key = sort.getmax(array);
        int[] radixSort = sort.radixSort(array,key);
     System.out.print("\nArray after Radix sort: ");
      for(int i=0;i<radixSort.length;i++){
      System.out.print(radixSort[i]+" ");
      }

     System.out.println();
    }
    
}