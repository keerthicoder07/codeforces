
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n=0;
		int nf=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		nf=sc.nextInt();
		n=sc.nextInt();
		int [] f=new int[nf];
		for(int i=0;i<nf;i++)
		{
		    f[i]=sc.nextInt();
		}
		for(int j=0;j<nf;j++)
		{
		    if(f[j]<=n)
		    sum+=1;
		    else
		    sum+=2;
		}
		System.out.println(sum);
	}
}
