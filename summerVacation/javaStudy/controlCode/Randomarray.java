import java.util.Random;
public class Randomarray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] result=new int[a.length];
        Random r=new Random();
        for(int i=0;i<a.length;i++){
            result[r.nextInt(a.length)]=a[i];
        }
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
