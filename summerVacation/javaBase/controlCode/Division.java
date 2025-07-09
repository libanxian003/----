import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Dividend=sc.nextInt();
        int Divisor=sc.nextInt();
        int result=0;
        while(Dividend>=Divisor){
            Dividend-=Divisor;
            result++;
        }
        System.out.println("The quotient is "+result);
        System.out.println("The remainder is "+Dividend);
        sc.close();

}
}
