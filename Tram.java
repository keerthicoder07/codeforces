/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Tram
{
	public static void main(String[] args) {
		int n=0;
		int en=0;
		int ex=0;
		int max=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    ex=sc.nextInt();
		    en=sc.nextInt();
		    sum-=ex;
		    sum+=en;
		    if(sum>max)
		    max=sum;
		}
		System.out.println(max);
}
}
