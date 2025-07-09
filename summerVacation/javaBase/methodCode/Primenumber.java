package summerVacation.javaBase.methodCode;

public class Primenumber {
    public static void main(String[] args) {
        int number=findPrimeNumber();
        System.out.println(number);
    }
    public static int findPrimeNumber(){
        int number=0;
        for(int i=101;i<200;i++){
            int squareRoot=(int) Math.sqrt(i);
            boolean isPrime=true;
            for(int j=2;j<squareRoot+1;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){
                number++;
            }
        }
        return number;
        
    }

}
