import java.util.Scanner;
class poly 
{
    int a,b,c,add;
    void add()
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers=");
a=sc.nextInt();
b=sc.nextInt();
add=a+b;
System.out.println("addtion of two numbers="+add);

    }
    void add(int c)
    {
        this.c=c;
        add=a+b+c;
        System.out.println("addtion of three numbers");
    }

    }
    public class polymo
    {
        public static void main(String[] args) 
            
        
        {
            int a,b,c;
            Scanner sc=new Scanner(System.in);
            poly m1=new poly();
            m1.add();
            System.out.println("enter third number");
            c=sc.nextInt();
            m1.add(c);
        }

    }
