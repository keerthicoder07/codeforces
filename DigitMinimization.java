import java.util.*;

public class DigitMinimization
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int num=sc.nextInt();
		    int m=99999999;
		        if (num<100)
		        {
		            System.out.println(num%10);
		        }
		        else
		        {
		            
		            while(num!=0)
		            {
		                if(m>num%10)
		                {
		                    m=num%10;
		                }
		                num/=10;
		            }
		            System.out.println(m);
		        }
		        
		}
	}
}
