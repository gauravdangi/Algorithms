#include<iostream>
#include<conio.h>

using namespace std;
int main()
{ 	int n, A[50], c, d, t;

	cout<<"Enter number of elements : --> ";
	cin>>n;
	cout<<"Enter array : --> ";
	for (c = 0; c < n; c++)
	{	cin>>A[c];
	}
	for (c = 1 ; c <= n - 1; c++)
	{ d = c;
	while ( d > 0 && A[d] < A[d-1])
	{ t = A[d];
	A[d] = A[d-1];
	A[d-1] = t;
	d--;
	}
	}
	cout<<"Sorted list in ascending order:\n";
	for (c = 0; c <= n - 1; c++)
	{  cout<<" "<<A[c];
	}

	return 0;
}
