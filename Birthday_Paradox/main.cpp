#include <iostream>
#include<math.h>
#include<conio.h>
using namespace std;
double probability(int num);
int main()
{   //clrscr();
    int num=0;

    cout<<"============================================================================================\n";
    cout<<"    ----------------------------    Birthday Paradox    -------------------------------\n";
    cout<<"============================================================================================\n\n";
    int flag = 1;
    do{
      cout<<"\nEnter number of people in room : ";
      cin>>num;
      double p = probability(num);
      cout<<"\nPobability/Chances that two people in a room sharing same birth date is = || "<<p<<" % ||";
      cout<<"\n\nDo you want to continue? (1 for Yes or 0 for No) \n :=> ";
      cin>>flag;
      cout<<"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    }while(flag==1);

    return 0;
}
double probability(int n){
 double p=1;
 if(n==1) return 100;
 for(int i=0;i<=n-1;i++){
    p = p*(365-(i));
 }
 p=p/pow(365,n);
 return (1-p)*100;
}
