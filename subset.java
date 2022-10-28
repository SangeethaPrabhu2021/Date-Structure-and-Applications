import java.util.*;
public class Pgm11 
{
	static int n,x[]=new int[10],w[]=new int[10];
	static int d,i,count=0;
	public static void main(String[] args) 
	 {
		int sum=0;
		System.out.println("Enter the value of n :-");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the Elements :-");
		for(i=1;i<=n;i++)
			{
				w[i]=sc.nextInt();
			}
		System.out.println("Enter the value of d:- ");
		d=sc.nextInt();
		for(i=1;i<=n;i++)
			{
				x[i]=0;
			}
		for(i=1;i<=n;i++)
		  {
			sum=sum+w[i];
		  }
		if(d>sum)
			{
			 System.out.println("No solution");
			}
			else
			{
				subset(0,1,sum);
				if(count==0)
				{
				System.out.println("No solution");
				}
			
			}
	  }
	
	
	public static void subset(int s,int k,int u)
	{
		int i;
		x[k]=1;
		if(s+w[k]==d)
		{
		count++;
		System.out.println("subset"+count);
		for(i=1;i<=k;i++)
			{
			if(x[i]==1)
				{
				System.out.println(w[i]);
				}
			}
		 System.out.println();
		}
		else if(s+w[k]+w[k+1]<=d)
			{
			subset(s+w[k],k+1,u-w[k]);
			}
		if(s+u-w[k]>=d)
			{
			x[k]=0;
			subset(s,k+1,u-w[k]);
			}
	}
}
