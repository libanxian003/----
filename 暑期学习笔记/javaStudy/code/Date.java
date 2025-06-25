import java.util.Scanner;
public class Date{
    public static void main(String args[]){
        System.out.println("Enter your sexy number.");
        Scanner sc=new Scanner(System.in);
        int yourSexy=sc.nextInt();
        System.out.println("Enter your partner sexy number");
        int partnerSexy=sc.nextInt();
        boolean result=yourSexy>partnerSexy;
        System.out.println(result);
        sc.close();
    }


}