import java.util.*;
public class LoveStory
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	   
		for(int i=0;i<n;i++)
		{
		   int count=0;
		   String str=sc.next();
		   //System.out.println(str);
		   String c="codeforces";
		   for(int j=0;j<10;j++)
		   {
		       if(str.charAt(j)!=c.charAt(j))
		       count++;
		   }
		   System.out.println(count);
		}
		
	}
}
