public class Meet7 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int temp=i;
            if(i%7==0){
                System.out.println(i);
            }else{
                while(temp>0){
                    int lastDigit=temp%10;
                    if(lastDigit==7){
                        System.out.println(i);
                        break;
                    }
                    temp/=10;
                }
            }

        }

    }
    
}
