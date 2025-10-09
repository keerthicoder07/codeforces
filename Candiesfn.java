import java.util.*;
public class Candiesfn
{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int c=sc.nextInt();
		    int c1=c;
		    while(c%3!=0)
		    {
		        c++;
		    }
		    System.out.println(c-c1);
		}
	}
}
