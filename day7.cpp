#include<iostream>
#include <string.h>
#include <vector>
using namespace std;

int  main()
{
    int n;
    cin>>n;
    vector<int> A(n);
    for(int i=0; i<n;i++)
    cin>>A[i];
    for(int i=n-1;i>=0;i--)
    cout<<A[i]<<" ";
    cout<<endl;
    return 0;
}
