import java.util.*;
public class SoliderBanana
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int w=sc.nextInt();
		int sum=0;
		for(int i=1;i<=w;i++)
		{
		    sum+=(i*k);
		}
		int res=sum-n;
		if(res<0)
		res=0;
		System.out.println(res);
	}
}
