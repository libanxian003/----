import java.util.Scanner;
public class Keyboard{
    public static void main(String args[]){
        System.out.print("Please input a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("You entered: " + number);
        sc.close();
    }
}   