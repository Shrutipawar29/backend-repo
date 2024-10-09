
import java.util.*;
class poly3{
	int a,b,c,max;
	void max()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos:");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
			System.out.println(a+" is max");
		else
			System.out.println(b+" is max");
	}
	void max(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		if(a>b && a>c)
			System.out.println(a+" is max");
		else if(b>a && b>c)
			System.out.println(b+" is max");
		else
			System.out.println(c+" is max");
	}
}
public class max {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		poly3 s1=new poly3();
		s1.max();
		System.out.println("Enter 3 nos:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		s1.max(a,b,c);
	}

}
