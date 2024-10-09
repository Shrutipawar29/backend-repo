import java.util.*;
class Employee
{
    int id;
    String name;
    String dob;
    Employee(int id,String name,String dob)
    {
        this.id=id;
        this.name=name;
        this.dob=dob;
    }
    void show()
    {
        System.out.println("Id="+id);
        System.out.println("Name="+name);
        System.out.println("DOB="+dob);
    }
}
class manager extends Employee
{
    String dname;
    String doj;

manager(int id ,String name,String dob,String dname,String doj)
{
    super(id,name,dob);
    this.dname=dname;
    this.doj=doj;
}
void display()
{
    System.out.println("Dname="+dname);
    System.out.println("DOJ="+doj);
}
}
 public class Single {
    public static void main(String[] args) {
        int id,n;
        String name;
        String dob;
        String dname;
        String doj;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employee");
        n=sc.nextInt();
        manager[] m1= new manager[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter id");
            id=sc.nextInt();
            System.out.println("Enter name");
            name=sc.next();
            System.out.println("Enter dob");
            dob=sc.next();
            System.out.println("Enter dname");
            dname=sc.next();
            System.out.println("Enter doj");
            doj=sc.next();
            m1[i]=new manager(id,name,dob,dname,doj);
            m1[i].show();
            m1[i].display();
        
        }
        
       
        
    }
}

