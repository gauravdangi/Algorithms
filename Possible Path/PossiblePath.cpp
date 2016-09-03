#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int gcd(int a, int b) {
return b == 0 ? a : gcd(b, a % b);
}

int main() {   
int t,i;
cin >> t;
int a,b,x,y;
for (i = 0;i<t;i++){

    cin>>a>>b>>x>>y

    if (gcd(a,b) == gcd(x,y)){
        cout<<"YES";
    } 
    else {
        cout<<"NO";
    }
}
    return 0;
}
