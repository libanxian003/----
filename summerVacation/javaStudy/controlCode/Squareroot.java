import java.util.Scanner;
public class Squareroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int squareRoot=0;
        while(squareRoot*squareRoot<number){
            squareRoot++;
        }
        if(squareRoot*squareRoot==number){
            System.out.println("The square root is "+squareRoot);
        }else{
            System.out.println("The integer part of the square root is "+ (squareRoot-1));
        }
        
        sc.close();
    }
}
