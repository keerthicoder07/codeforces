import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ma=n>m?n:m;
		int mi=n<m?n:m;
		int c=0;
		if(m==1 && n==1)
		{
		    System.out.println(2);
		    return;
		    
		}
		for(int i=0;i<=ma/2 && i<=mi;i++)
		{
		    for(int j=0;j<=ma/2 && j<=mi;j++)
		    {
		        if((Math.pow(i,2)+j)==n)
		        {
		            if(i+(Math.pow(j,2))==m)
		            c++;
		        }
		    }
		}
		System.out.println(c);
	}
}
