package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {
    public static void main(String[] args) {
        /**
         * 获取功能
         * 获取下面字符串中由三个单词组成的字符串
         */
        String s = "da jia ting wo shuo,jin tian yao xia wu bu shang wan zi xi kai xin bu ?";
        String regex = "\\b\\w{3}\\b";
        //把规则编译成模式对象
        Pattern p = Pattern.compile(regex);
        //通过模式对象得到匹配器对象
        Matcher m = p.matcher(s);
        //调用匹配器对象的功能
        //通过find方法查找有没有满足条件的子串
        while (m.find()){
            System.out.println(m.group());
        }
        /**
         * 注意：一定要先find(),然后才能group()
         */
    }
}
