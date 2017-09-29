#include <iostream>

using namespace std;

void ogyeah(int b){
    int flag = b;
    for(int i=1;i<=3;i++){

        for(int j=1;j<=5;j++){
            cout<<flag<<" ";
            flag++;
        }
        cout<<endl;
        flag = flag+5;
    }
    flag = b+5;
    for(int i=1;i<=2;i++){

        for(int j=1;j<=5;j++){
            cout<<flag<<" ";
            flag++;
        }
        cout<<endl;
        flag = flag+5;
    }

}


int main()
{
    int n;
    cin>>n;
    cout<<endl;
    ogyeah(n);
    return 0;
}

