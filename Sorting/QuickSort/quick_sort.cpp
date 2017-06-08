#include <iostream>

using namespace std;
void swap(int a,int b){
int temp = a;
 a=b;
 b=temp;
}

int pivot(int arr[],int start,int last){
 int flag=start;
 for(int i=0;i<last-1;i++){
   if(arr[i]<=arr[last]){
    swap(arr[i],arr[flag]);
    flag++;
   }
 }
swap(arr[flag],arr[last]);
 return flag;
}

void quick_sort(int arr[],int start,int last){
 if(start>=last)
    return;
 int p = pivot(arr,start,last);
 quick_sort(arr,start,p-1);
 quick_sort(arr,p+1,last);

}

int main(){
 int list[] = {15,27,30,33,33,41,55,64,72,99,101,102};
 int n = sizeof(list)/sizeof(int);
 quick_sort(list,0,n);
 cout<<"Sorted list is: ";
  for(int i=0;i<n;i++){
    cout<<" "<<list[i];
 }
 return 0;
}
