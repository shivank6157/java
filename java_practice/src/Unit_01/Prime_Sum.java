package Unit_01;
import java.util.Scanner;

public class Prime_Sum 
{
	static int primeCheck(int n)
	{
		if(n==1)
		{
		  return 0;
		}
		
		else 
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				 return 0;
			}
		}
		
		return 1;
	}
	
	static int sumprime(int a,int b)
	{
		int p;
		int sum=0;
		for(int i=b;i>=a;i--)
		{
            p=primeCheck(i);
			
			if(p==1)
			{
			  sum=sum+i;
			}
		}
		
		return sum;
	}
	
	

	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter range");
		int l=sc.nextInt();
		int r=sc.nextInt();
		System.out.println(sumprime(l,r));
	}

}
