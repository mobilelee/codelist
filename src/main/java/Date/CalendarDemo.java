package Date;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo {
    /**
     * 获取任意一年的二月份有多少天
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("请输入年份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,2,1);//其实获取的是这一年的3月1日，因为月份是从0开始计算的
        calendar.add(Calendar.DAY_OF_MONTH,-1);//把3月1号减一，就是二月的最后一天
        System.out.println(calendar.get(Calendar.DATE));

    }
}
