import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: "); 
        s = sc.nextLine();
        char ch;
        for(int i=0; i<s.length();i++){
            ch = s.charAt(i);
            if(ch>='A' && ch<='z'){
                ch = (char)(ch-32);
                System.out.print(ch);
            }
            else if(ch >='a'&& ch <='z'){
                ch = (char)(ch+32);
                System.out.print(ch);
            }
        }

    }
}   