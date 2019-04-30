package String;

import java.util.Scanner;

public class GuessNumer {
    public static void start(){
        int number = (int)(Math.random()*100)+1;

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你要猜的数据（1-100）：");
            int guessNumber = scanner.nextInt();
            if (guessNumber>number){
                System.out.println("你猜的"+guessNumber+"大了");
            }else if (guessNumber<number){
                System.out.println("你猜的"+guessNumber+"小了");
            }else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
    }

}
