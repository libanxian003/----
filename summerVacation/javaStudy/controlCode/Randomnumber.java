import java.util.Random;
public class Randomnumber{
    public static void main(String[] args) {
        Random r=new Random();
        int number=0;
        for(int i=1;i<10000000;i++){
            number=r.nextInt(100);
            number++;
            System.out.println(number);
        }
    }
}
