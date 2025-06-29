package summerVacation.javaStudy.methodCode;
import java.util.Scanner;
public class Ticket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the month of the flight.");
        int month=sc.nextInt();
        System.out.println("Please confirm if you are the first class.(enter true or false)");
        boolean isFirstClass = sc.nextBoolean();
        System.out.println("Please enter the price of your ticket");
        double price=sc.nextDouble();
        double newPrice=calculate(month, isFirstClass, price);
        printNewPrice(newPrice);
        sc.close();

    }
    private static void printNewPrice(double newPrice) {
        System.out.println("The discounted price  of your ticket is "+newPrice);
    }   
    public static double calculate(int month,boolean isFirstClass,double price){
        double newPrice;
        if(month<10&&month>5){
            if(isFirstClass){
                newPrice=0.9*price;
                return newPrice;
            }else{
                newPrice=0.85*price;
                return newPrice;
            }
        }else{
            if(isFirstClass){
                newPrice=0.7*price;
                return newPrice;
            }else{
                newPrice=0.65*price;
                return newPrice;
            }
        }
    }
}
