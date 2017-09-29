#include <iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        for(int j=1;j<n-i;j++){
            cout<<" ";
        }
        int flag = 1;
        int p=0;
        for(int k=0;k<(2*i)+1;k++){
            if(flag<(i+1) && p==0){
                cout<<flag;
                flag++;
            }
            else{
                cout<<flag;
                flag--;
                p=1;

            }
        }
        cout<<endl;
    }
    return 0;

}
