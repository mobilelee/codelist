package utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils(){

    }

    /**
     * 此方法用于将日期格式转换成字符串格式
     * @param date 被转换的日期
     * @param foramt 转换的格式类型
     * @return 格式化后的字符
     */
    public static String dateToString(Date date,String foramt){

        return new SimpleDateFormat(foramt).format(date);
    }

    /**
     * 此方法用于将字符串转换成日期格式
     * @param s 被转换的字符串
     * @param format 转换的格式类型
     * @return 解析后的日期对象
     * @throws ParseException
     */
    public static Date stringToDate(String s,String format) throws ParseException {
        return new SimpleDateFormat(format).parse(s);
    }
}
