import java.util.scanner;

public class ParaMethodDemo 
{	
	int flag=0,n1,n,x,sum=0,p,f1=1,i;
	public ParaMethodDemo (int n)
	{
		this.n=n;
	}
	public void pattern()
	{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
		Console.Write("{0} ",j);
		}
		Console.WriteLine();
	}
	}
	public void prime()
	{
		
		for(i=2;i<=(n/2);i++)
		{
		if(n%i==0)
		{
		flag=1;
		break;
		}
		}
		
		if(flag==0)
			Console.WriteLine("No is prime");
		else
			Console.WriteLine("No is not prime");
	}
	public string pal()
	{
		p=n;
		while(p>0)
		{
		n1=p%10;
		p=p/10;
		sum=(sum*10)+n1;
		}
		
		if(sum==n)
			return "No is pal";
		else
			return "No is not pal";
	}
	public int power(int x)
	{
		f1=1;
		this.x=x;
		for (i =0;i<=n;i++) {
			f1=f1*x;

			
		}
		return (f1);

	}
	public static void main(String[] args) {
		
	}

