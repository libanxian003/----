import java.util.Random;
public class Shuffle{
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        Random random=new Random();
        for(int i=0;i<num.length;i++){
            
            int change=random.nextInt(num.length-i);
            int temp=0;
            temp=num[change];
            num[change]=num[num.length-1-i];
            num[num.length-1-i]=temp;


        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}