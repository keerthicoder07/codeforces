import java.util.*;
public class SquareString
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int k=0;k<n;k++)
	    {
	        String str=sc.next();
	        if(str.length()%2==1)
	        System.out.println("NO");
	        else
	        {
	            int h=str.length()/2;
	            int i=0;
	            int j=h;
	            while(i<h&&j<str.length()&&str.charAt(i)==str.charAt(j))
	            {
	                i++;
	                j++;
	            }
	            if(i==h)
	            {
	                System.out.println("YES");
	            }
	            else{
	                System.out.println("NO");
	            }
	        }
	    }
		
	}
}
