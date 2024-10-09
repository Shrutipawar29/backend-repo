import java.util.Scanner;
public class CharAtExample

{
public static void main(String[] args)
{
String str ;        
Scanner sc=new Scanner(System.in);
System.out.println("Enter string");
str=sc.next();
//for (int i=1; i<str.length(); i=i+2) 
for( int i=0; i<str.length();i=i+2)
{  
    
        System.out.println("Char at "+i+" place "+str.charAt(i));  
   
}  
}
}


    

