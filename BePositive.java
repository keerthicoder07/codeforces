import java.util.*;
public class BePositive
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		
		for(int m=0;m<l;m++)
		{
		int c=0;
		int f=0;
		int n=sc.nextInt();    
		int arr[]=new int[n];
		for(int j=0;j<n;j++)
		{
		    arr[j]=sc.nextInt();
		    if(arr[j]==0)
		    {
		    arr[j]=1;
		    c++;
		    }
		    
	   }
	   if(product(arr)>0) 
	   {
	   System.out.println(c);
	   continue;
	   }
	   for(int k=0;k<n;k++)
	   {
	       if(arr[k]==-1)
	       {
	       arr[k]=1;
	       c+=2;
	       }
	       if(product(arr)>0)
	       {
	       f=1;
	       break;
	       }
	       
	   }
	   if(f==1)
	   {
	       System.out.println(c);
	   }
	}
		
	}
	static int product (int arr[])
	{
	    int s=1;
	    for(int i=0;i<arr.length;i++)
	    {
	        s*=arr[i];
	    }
	    return s;
	}
}
