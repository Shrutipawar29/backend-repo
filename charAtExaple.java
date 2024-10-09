
import java.util.*;
public class charAtExaple
{
    public static  void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        str=sc.next();
        for(int i=0; i<str.length();i++)
        {
            System.out.println("char at "+i+"place "+str.charAt(i));

        }
    }
}