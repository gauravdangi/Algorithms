#include <iostream>
#include <conio.h>
#include <string.h>

using namespace std;
 int maxlength;  //length of string
 int s=0;            //Starting point of string
 int e=0;            //Ending point of string
void initV(int len,int a,int b){
 if(len>maxlength){
    maxlength = len;
    s=a;
    e=b;
 }
}
int main()
{   string str;
    cout << "Enter String !" << endl;
    getline(cin,str);
    cout<<"\nYou Entered -> "<<str<<"\n---------------\n";
    int i=0;
    int len;
    int st;
    int en;
    while(str[i]!='\0'){
            len = 0;
            st = i;
            while(int(str[i]+1) == int(str[i+1])){
                len = len+1;
                en = i+1;
                i=i+1;
            }
      initV(len,st,en);
      i=i+1;
    }

    cout<<"maximum length = "<<maxlength+1<<endl;
    cout<<"String is : ";

    i=s;
    while(i<=e){
        cout<<str[i];
        i=i+1;
    }
    cout<<"\n-------------------------------";
}
