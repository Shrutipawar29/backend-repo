import java.util.Scanner;
public class AreaDemo 
{
	double r,A;
	AreaDemo(double r)
	{
		this.r=r;
	}
	double cal_area()
	{
		A=3.14*r*r;
		return(A);
	}
                    public static void main(String[] args) 
	{
		double r,A;
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter value of r");
		r=sc.nextDouble();
		AreaDemo a1=new AreaDemo(r);
		A=a1.cal_area();
		System.out.println("Area="+A);
	}

}

    

