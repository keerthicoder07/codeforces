import java.util.*;
public class SystemOfEquations
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int mi=n<m?n:m;
		int c=0;
		for(int i=0;i<=mi;i++)
		{
		    for(int j=0;j<=mi && j<=mi;j++)
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
