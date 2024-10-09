import java.util.Scanner;

abstract class area{
	abstract void cal_area();
	abstract void cal_vol();
}
class circle extends area{
	double r,A,V;
	circle(double r)
	{
		this.r=r;
	}
	public void cal_area()
	{
		A=3.14*r*r;
		System.out.println("Area:"+A);
	}
	public void cal_vol()
	{
		V=(4/3)*3.13*r*r*r;
		System.out.println("Volume:"+V);
	}
}
class cone extends area{
	double r,h,A,V;
	cone(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	public void cal_area()
	{
		A=(1/3)*3.14*r*r*h;
		System.out.println("Area:"+A);
	}
	public void cal_vol()
	{
		V=(1/3)*3.14*r*r*h;
		System.out.println("Volume:"+V);
	}
}
class cylinder extends area{
	double r,h,A,V;
	cylinder(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	public void cal_area()
	{
		A=2*3.14*r*h+2*3.14*r*r;
		System.out.println("Area:"+A);
	}
	public void cal_vol()
	{
		V=3.14*r*r*h;
		System.out.println("Volume:"+V);
	}
}
class sphere extends area{
	double r,A,V;
	sphere(double r)
	{
		this.r=r;
	}
	public void cal_area()
	{
		A=4*3.14*r*r;
		System.out.println("Area:"+A);
	}
	public void cal_vol()
	{
		V=(4/3)*3.14*r*r*r;
		System.out.println("Volume:"+V);
	}
}
class box extends area{
	double l,b,h,A,V;
	box(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void cal_area()
	{
		A=(l*b)+(b*h)+(h*l);
		System.out.println("Area:"+A);
	}
	public void cal_vol()
	{
		V=l*b*h;
		System.out.println("Volume:"+V);
	}
}
public class Area{
	

	public static void main(String[] args) {
		double r,h,l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter r:");
		r=sc.nextDouble();
		circle c1=new circle(r);
		c1.cal_area();
		c1.cal_vol();
		System.out.println("Enter r,h:");
		r=sc.nextDouble();
		h=sc.nextDouble();
		cone s1=new cone(r,h);
		s1.cal_area();
		s1.cal_vol();
		System.out.println("Enter r:");
		r=sc.nextDouble();
		sphere x1=new sphere(r);
		x1.cal_area();
		x1.cal_vol();
		System.out.println("Enter l,b,h");
		l=sc.nextDouble();
		b=sc.nextDouble();
		h=sc.nextDouble();
		box a1=new box(l,b,h);
		a1.cal_area();
		a1.cal_vol();
	}

}