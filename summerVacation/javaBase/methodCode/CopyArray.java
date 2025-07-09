package summerVacation.javaBase.methodCode;


public class CopyArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int from=2;
        int to=4;
        int[] b=copyArray(a, from, to);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
    public static int[] copyArray(int[] a,int from,int to){
        int length=to-from+1;
        int[] newArray=new int [length];
        int j=0;
        for(int i=from;i<=to;i++){
            newArray[j]=a[i];
            j++;
        }
        return newArray;
    }
}
