/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Stringequal
{
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    String str1=sc.next();
		    String str2=sc.next();
		    if(str1.equals(str2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        int n1=str1.length();
		        int n2=str2.length();
		        char[]s1=str1.toCharArray();
		        char[]s2=str2.toCharArray();
		        int f=0;
		        for(int k=0;k<n1;k++)
		        {
		            for(int j=0;j<n2;j++)
		            {
		                if(s1[k]==s2[j])
		                {
		                    System.out.println("YES");
		                    f=1;
		                    break;
		                }
		            }
		            if(f==1)
		            break;
		        }
		        if(f!=1)
		        System.out.println("NO");
		        
		    }
		}
	}
}
