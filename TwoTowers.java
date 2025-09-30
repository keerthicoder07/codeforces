import java.util.*;
public class TwoTowers
{
	public static void main(String[] args) 
	{
	
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++)
        {
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();
            int c=0;
            StringBuilder sb=new StringBuilder(s2).reverse();
            String res=s1+sb.toString();
            for(int i=0;i<res.length()-1;i++)
            {
                if(res.charAt(i)==res.charAt(i+1))
                c++;
            }
            if(c>1)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
	}
}
