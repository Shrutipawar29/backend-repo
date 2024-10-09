import java.util.*;
interface sal
{
	final double tax=0.05;
	abstract void cal_sal();
}
class Employee
{
	int eid;
	String name;
	double bs;
	void accept()
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter number");
	int eid=sc.nextInt();
	System.out.println("enter name");
	String name=sc.next();
	System.out.println("enter basic salary");
	double bs=sc.nextDouble();
	}
	void display(){
	System.out.println("eid:"+eid);
	System.out.println("name:"+name);
	System.out.println("bs"+bs);
	
		
	}
}
class emp_sal extends Employee implements sal
{
	double hra,ta,da,gs;	
	public void cal_sal() 
{
		hra=bs*0.40;
		da=bs*0.40;
		ta=bs*0.40;
		gs=(hra+ta+da+bs)-(bs*tax);
		System.out.println("Hara"+hra);
System.out.println("Ta"+ta);
System.out.println("DA"+da);
System.out.println("Tax"+tax);
System.out.println("GS"+gs);
	}}
public class Main {

	public static void main(String[] args)
	{
		emp_sal e1=new emp_sal();
		e1.accept();
		e1.display();
		e1.cal_sal();

	}

}
    

