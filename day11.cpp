#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int sum=0;
    int a[6][6];
    for(int i=0;i<6;i++)
    {
        for(int j=0; j<6;j++)
        {
            cin>> a[i][j];
        }
    }
    vector<int> v;
    for(int i=0;i<4;i++)
    {
        for(int j=0; j<4;j++)
        {
            sum=sum+a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
           
           v.push_back(sum); 
           sum=0;
        }
    }
    cout<<*max_element(v.begin(),v.end());
   
}
