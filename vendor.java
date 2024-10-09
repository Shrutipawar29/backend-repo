
import java.util.*;
abstract class order{
	int id;
	String name;
	double amt;
	order(int id,String name,double amt)
	{
		this.id=id;
		this.name=name;
		this.amt=amt;
	}
	abstract void show();
}
class purchase_order extends order{
	String vendor_name;
	purchase_order(int id,String name,double amt,String vendor_name)
	{
		super(id,name,amt);
		this.vendor_name=vendor_name;
	}
	public void show()
	{
		System.out.println("Id:"+id+"\nName:"+name+"\nAmt:"+amt+"\nCust_name:"+vendor_name);
		
	}
}
class sales_order extends order{
	String cust_name;
	sales_order(int id,String name,double amt,String cust_name)
	{
		super(id,name,amt);
		this.cust_name=cust_name;
	}
	public void show()
	{
		System.out.println("Id:"+id+"\nName:"+name+"\nAmt:"+amt+"\nCustomer name:"+cust_name);
	}
}
public class vendor {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter staff id:");
		int id=sc.nextInt();
		System.out.println("Enter staff name:");
		String name=sc.next();
		System.out.println("Enter order amt:");
		double amt=sc.nextDouble();
		System.out.println("Enter vendor name:");
		String vendor_name=sc.next();
		purchase_order p1=new purchase_order(id,name,amt,vendor_name);
		p1.show();
		
		System.out.println("Enter staff id:");
		id=sc.nextInt();
		System.out.println("Enter staff name:");
		name=sc.next();
		System.out.println("Enter staff amt:");
		amt=sc.nextDouble();
		System.out.println("Enter vendor name:");
		vendor_name=sc.next();
		System.out.println("Enter customer name:");
		String cust_name=sc.next();
		sales_order s1=new sales_order(id,name,amt,cust_name);
		s1.show();
	}

}
