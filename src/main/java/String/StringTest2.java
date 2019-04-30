package String;

public class StringTest2 {
    public static void main(String[] args) {
        String s = "Hello123World";

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i=0;i<s.length();i++){
           int ch =  s.charAt(i);
            if(ch>='0'&& ch<='9'){
                numberCount++;
            }else if(ch>='a' && ch<='z'){
                smallCount++;
            }else if (ch>='A' && ch<='Z'){
                bigCount++;
            }
        }
        System.out.println("大写字母个数：" + bigCount);
        System.out.println("小写字母个数：" + smallCount);
        System.out.println("数字个数：" + numberCount);
    }
}
