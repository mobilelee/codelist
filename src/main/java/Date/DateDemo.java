package Date;

import utils.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入出生年月日：");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-HH");
        Date date = sdf.parse(line);
        long birthTime = date.getTime();
        long nowTime = System.currentTimeMillis();
        long time = nowTime - birthTime;
        long day = time/1000/60/60/24;
        System.out.println("你来到世界"+day+"天");

    }
}
