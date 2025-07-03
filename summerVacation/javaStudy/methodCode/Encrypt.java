package summerVacation.javaStudy.methodCode;
import java.util.Scanner;
public class Encrypt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int orginInput=sc.nextInt();
        int encryptPassword=encrypt(orginInput);
        System.out.println(encryptPassword);

        sc.close();
    }
    public static int encrypt(int orginInput){

        int digit=getdigit(orginInput);
        int encryptPassword=plusFiveReverse(orginInput,digit);
        return encryptPassword;
    }
    public static int getdigit(int orginInput){
        int digit=0;
        for(int temp=orginInput;temp>0;temp/=10){
            digit++;
        }
        return digit;
    }
    public static int plusFiveReverse(int orginInput,int digit){
        int tempPlusFive=0;
        for(int i=0;i<digit;i++){
            int temp=(orginInput%10+5)%10;
            tempPlusFive=tempPlusFive*10+temp;
            orginInput/=10;
        }
        return tempPlusFive;
    }
}