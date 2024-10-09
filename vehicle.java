
import java.util.*;
class veh{
	String company;
	double price;
	veh(String company,double price)
	{
		this.company=company;
		this.price=price;
	}
	void display_veh()
	{
		System.out.println("Vehicle company:"+company);
		System.out.println("Vehicle price:"+price);
	}
}
class lightmotor extends veh{
	String mileage;
	lightmotor(String company,double price,String mileage)
	{
		super(company,price);
		this.mileage=mileage;
	}
	void show_lightmotor()
	{
		display_veh();
		System.out.println("Mileage:"+mileage);
	}
}
class heavymotor extends veh{
	String capacity_in_tons;
	heavymotor(String company,double price,String capacity_in_tons)
	{
	super(company,price);
	this.capacity_in_tons=capacity_in_tons;
	}
	void show_heavymotor()
	{
		display_veh();
		System.out.println("capacity_in_tons:"+capacity_in_tons);
	}
}
public class vehicle {

	public static void main(String[] args) {
		String company,mileage,capacity_in_tons;
	
        double price;
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Accept details of lightmotor vehicle");
			System.out.println("2.Accept details of heavymotor vehicle");
			System.out.println("3.exit");
			System.out.println("Enter ur choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter company,price,mileage");
			company=sc.next();
			price=sc.nextDouble();
			mileage=sc.next();
			lightmotor m1=new lightmotor(company,price,mileage);
			m1.show_lightmotor();
			break;
			case 2:System.out.println("Enter vehicle company,price,capacity_in_tons");
			company=sc.next();
			price=sc.nextDouble();
			capacity_in_tons=sc.next();
			heavymotor s1=new heavymotor(company,price,capacity_in_tons);
			s1.show_heavymotor();
			break;
			default:System.out.println("Invalid choice");
			}
		}while(ch<2);
		sc.close();
	}

}