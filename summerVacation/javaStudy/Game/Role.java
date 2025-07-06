package summerVacation.javaStudy.Game;

import java.util.Random;
public class Role {
    private String name;
    private int blood;
    private int attack;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public Role(String name,int blood,int attack){
        this.name=name;
        this.blood=blood;
        this.attack=attack;
    }
    public void attack(Role role){
        Random r=new Random();
        int hurt=r.nextInt(this.attack);
        int remainBlood=role.getBlood()-hurt;
        if(remainBlood<=0){
            role.setBlood(0);
            System.out.println(role.getName()+"被"+this.name+"打死了");
            return;
        }else{
            role.setBlood(remainBlood);
            System.out.println(this.name+"攻击了"+role.getName()+"造成了"+this.attack+"点伤害"+role.getName()+"还剩下"+role.getBlood()+"点血");
        }
        
    }
}
