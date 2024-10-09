import java.util.Scanner;
public class demo{
    public static void main(String[] args) {
        String email;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a email");
        email = sc.nextLine();
        int count1=0;
        int count2 =0;
        char ch;
        if(email.length()>=10)
        for(int i=0;i<email.length();i++){
            ch = email.charAt(i);
            if(ch=='@'){
                count1++;
            }
            if(ch =='.'){
                count2++;
            }


        }
        if(count1==1 && count2==1){
        System.out.println("Enter email is valid");

    }
    else{
        System.out.println("Enter email is not valid");
    }
}
