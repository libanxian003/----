import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<number;i++){
            for(int j=2;j<i;j++){
                if (i*j==number){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime==false){
            System.out.println("It is not a Prime number");
        }else{
            System.out.println("It is a Prime number");
        }
        sc.close();
    }
}
