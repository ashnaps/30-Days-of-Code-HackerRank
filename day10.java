import java.io.*;
import java.util.*;

    
   

public class p2{
public static void main(String args[])
{
	int n;
	int count=0,max=0;
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    while(n>0)
    {
        int rem=n%2;
        n=n/2;
        if(rem==1)
        count++;
        else count=0;
        if(count>max)
        	max=count;
    }
    System.out.println(max);
}
}
