import java.util.*;
public class SubsequencePermutation
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int k=0;k<n;k++)
		{
		    int c=0;
		    int l=sc.nextInt();
		    String str=sc.next();
		    char[] s=str.toCharArray();
		    char[] so=str.toCharArray();
		    Arrays.sort(s);
		    for(int i=0;i<l;i++)
		    {
		        if(s[i]!=so[i])
		        {
		            c++;
		        }
		    }
		    System.out.println(c);
		}
	}
}
