
import java.util.Scanner;
class Area1
{
    double r,a;
    Area1(double r)
    {
        this.r=r;
    }
}
void cal_area()
{
    3.14*r*r;
    System.out.println("Radius="+r+"\bArea="+A);
}

class volume11 extends Area1
{
    double h,v;
    volume11(double r,double h)
    {
        super(r);
        this.h=h;
    }
    void cal_area();
    v=A*h;
    System.out.println("H="+h+"\n volume"+v);
}
}
public class main{
    public static void main(String[] args) {
        double r,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r & h");
        r=sc.nextDouble();
        h=sc.nextDouble();
        Volume11 v1= new Volume11(r,h);
        v1.cal area();
    }
}