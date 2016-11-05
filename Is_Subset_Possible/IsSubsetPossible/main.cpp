#include <iostream>
#include<conio.h>
#include <stdlib.h>

using namespace std;

bool possible(int arr[], long num,int k);
bool check(int arr[],long num,int k);
bool divisible(int arr[],long num,int k);

int main()
{
        int n;
        long num;
        int flag;
        do{

        cout<<"\nEnter size of array : ";
        cin>>n;
        int arr[n];
        cout<<"\nEnter array of integers : ";
        for(int i=0;i<n;i++){
         cin>>arr[i];
        }

        cout<<"\nEnter number: ";
        cin>>num;
        int a = possible(arr,num,n);
        string ans;
        if(a==1) ans = "TRUE";
        else ans = "FLASE";
        cout<<"\n\nIs Subset of '"<<num<<"' is possible?\n ---->  "<<ans;
          cout<<"\nDo you want to continue? (1 for yes and 0 for no)";
          cin>>flag;

        }while(flag==1);
        getch();
    return 0;
}

     bool possible(int arr[],long num,int k){

        if(check(arr,1,k)) return true;

        for(int i=0;i<k;i++){
          if(check(arr,num%arr[i],k)) return true;
            else if(check(arr,(arr[i]+num%arr[i]),k)) return true;
            else if(divisible(arr,num%arr[i],k)) return true;

        }
        return false;
    }

    bool check(int arr[],long num,int k){
     for(int i=0;i<k;i++){
      if(arr[i]==num) return true;
     }
     return false;
    }

    bool divisible(int arr[],long num,int k){
        for(int i=0;i<k;i++){
          if(num%arr[i]==0) return true;
        }
        return false;
    }
