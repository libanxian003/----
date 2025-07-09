import java.util.Scanner;
public class Ticket{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ticketNumber=sc.nextInt();
        boolean isOdd=(ticketNumber % 2 == 1);
        if(isOdd){
            System.out.println("left");
        }else{
            System.out.println("right");
        }
        sc.close();
    }
}