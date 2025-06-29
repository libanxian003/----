package summerVacation.javaStudy.methodCode;

public class ArraySearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        boolean isFound=arraySearch(a,6);
        printSearchResult(isFound);
        
    }
    public static boolean arraySearch(int[] a,int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void printSearchResult(boolean isFound){
        if(isFound==true){
            System.out.println("Found!");
        }else{
            System.out.println("Not Found!");
        }
    }
}   

