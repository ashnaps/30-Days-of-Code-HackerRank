#include<iostream>
#include <string.h>
using namespace std;

int  main()
{
    char A[1000000];
    int n;
    cin>>n;
    for(int i=0; i<n;i++)
    cin>>A[i];
    for(int i=n-1;i>=0;i--)
    cout<<A[i]<<" ";
}
