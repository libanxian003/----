public class Change {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        for(int i=0;i<a.length/2;i++){
            int temp=0;
            temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-1-i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
