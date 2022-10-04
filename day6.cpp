#include<iostream>
#include <string.h>
using namespace std;

int  main()
{
    int t;
    cin>>t;
    while(t--){
    char s[100000];
    cin>>s;
    int n=strlen(s);
    for(int i=0;i<n;i++)    
    {
        if(i%2==0)
        cout<<s[i];
    }
    cout<<" ";
    for(int i=0;i<n;i++)    
    {
        if(i%2!=0)
        cout<<s[i];
    }
    cout<<endl;
    }
}
