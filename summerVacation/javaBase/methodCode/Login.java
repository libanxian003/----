package summerVacation.javaBase.methodCode;

import java.util.Scanner; 
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        login(username, password);
        scanner.close();
    }
    public static void login(String username,String password){
        for(int i=0;i<3;i++){
        if(username.equals("admin")&&password.equals("123456")){
            System.out.println("登录成功");
            break;
        }else{
            System.out.println("登录失败");
            if(i==2){
                System.out.println("登录失败，请稍后重试");
            }
        }
        }
    }
}
