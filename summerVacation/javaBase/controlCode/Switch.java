import java.util.Scanner;
public class Switch{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        // switch(number){
        //     case 1:
        //         System.out.println("business 1");
        //         break;
        //     case 2:
        //         System.out.println("bussiness 2");
        //         break;
        //     default:
        //         System.out.println("error");
        // }
        switch (number) {
            case 1->{
                System.out.println("business 1");
            }
            case 2->{
                System.out.println("bussiness 2");
            }
            default->{
                System.out.println("error");
            }
        }
        sc.close();
    }
    
}