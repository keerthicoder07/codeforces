import java.util.*;
public class TomRiddle
{
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     HashSet<String> map=new HashSet<String>();
	     for(int i=0;i<n;i++)
	     {
	        String str=sc.next();
	        if(!map.contains(str))
	        {
	            map.add(str);
	            System.out.println("NO");
	        }
	        else
	        {
	            System.out.println("YES");
	        }
	     }
	}
}
