package summerVacation.javaStudy.Game;

public class GameTest {
    public static void main(String[] args) {
        Role r1=new Role("大坨",100,10);
        Role r2=new Role("yanyan小美女",100,8);
        while(true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0){
                break;
            }
        }

    }
}
