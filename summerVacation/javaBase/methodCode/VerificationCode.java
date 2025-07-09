package summerVacation.javaBase.methodCode;
import java.util.Random;
public class VerificationCode {
    public static void main(String[] args) {
        String verticatationCode=createVerticatationCode();
        printverticationCode(verticatationCode);

    }
    public static String createVerticatationCode(){
        String verificationCode="";
        Random random=new Random();
        int firstFourNumber=random.nextInt(8999)+1000;
        char lastLetter;
        if(random.nextBoolean()){
            lastLetter=(char)(random.nextInt(26)+'a');
        }else{
            lastLetter=(char)(random.nextInt(26)+'A');
        }
        verificationCode=firstFourNumber+""+lastLetter;
        return verificationCode;
    }
    public static void printverticationCode(String verticatationCode){
        // for(int i=0;i<verticatationCode.length();i++){
        //     System.out.println(verticatationCode.charAt(i));
        // }   
        System.out.println(verticatationCode);
    }
}
