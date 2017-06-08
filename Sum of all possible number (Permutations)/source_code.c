#include <stdio.h>
#include <stdlib.h>

//returns sum of array
int sum(int a[],int len){
    int i,sum=0;
  for(i=0;i<len;i++){
    sum+=a[i];
  }
  return sum;
}

//returns factorial
int fact(int n){
int i,f=1;
for(i=1;i<=n;i++){
    f*=i;
}
return f;
}

//returns integer of 1's of length n, i.e if n=4, then it will return 1111
int last(int n){
int sum=0;
int x = 1;
while(n>0){
    sum+=x;
    x=x*10;
    n=n-1;
}
return sum;
}

int sumofallnum(int a[],int len){
 int s = sum(a,len);
 int f = fact(len-1);
 int l = last(len);
 int ans = f*s*l;
 return ans;
}

int main()
{   int n;
    printf("It will give sum of all numbers formed from a given integer \n");
    printf("-------------------------------------------------------------------------------\n");
    printf("If 'n' distinct digits are used to make all the possible n-digit numbers, we get n! numbers. We now want to find out the sum of all the n! numbers\n");
    printf("-------------------------------------------------------------------------------\n");
    printf("Enter number of integers: ");
    scanf("%d",&n);
    int num[n];
    printf("\nEnter numbers:- \n");
    int i;
    for(i=0;i<n;i++){
        scanf("%d",&num[i]);
    }
    int len = sizeof(num)/sizeof(int);
    printf("Sum of all number formed from input digits is : ||  %d  ||\n",sumofallnum(num,len));
    return 0;
}
