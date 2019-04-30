package String;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";
        for (int i=0;i<3;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = scanner.nextLine();
            System.out.println("请输入密码：");
            String pwd = scanner.nextLine();

            if (name.equals(username) && pwd.equals(password)){
                System.out.println("登录成功");
                GuessNumer.start();
                break;
            }else {
                if (2-i ==0){
                    System.out.println("账号冻结");
                }else {
                    System.out.println("输入账号或者密码有误，还有"+(2-i)+"次机会");
                }
            }
        }
    }
}
