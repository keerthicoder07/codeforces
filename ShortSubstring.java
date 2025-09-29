import java.util.*;
public class ShortSubstring{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    String str=sc.next();
		    String res="";
		    if(str.length()==2)
		    {
             res=str;
             System.out.println(res);
		    }
  		    else
		    {
		        
		        for(int j=0;j<2;j++)
		        {
		            res=res+str.charAt(j);
		        }
		        for(int k=3;k<str.length();k+=2)
		        {
		            res=res+str.charAt(k);
		        }
		        System.out.println(res);
		    }
		}
	}
}
