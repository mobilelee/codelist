package regex;

public class RegexDemo {

    public static void main(String[] args) {
        String s1 = "aa,bb,cc";
        String[] str1Array = s1.split(",");
        for (int i=0;i<str1Array.length;i++){
            System.out.println(str1Array[i]);
        }
        System.out.println("-----------------------");


        String s2 = "aa.bb.cc";
        String[] str2Array = s2.split("\\.");
        for (int i=0;i<str2Array.length;i++){
            System.out.println(str2Array[i]);
        }
        System.out.println("-----------------------");


        String s3 = "aa   bb      cc";
        String[] str3Array = s3.split(" +");
        for (int i=0;i<str3Array.length;i++){
            System.out.println(str3Array[i]);
        }
        System.out.println("-----------------------");



        String s4 = "E:\\Java\\se01\\java.java";
        String[] str4Array = s4.split("\\\\");
        for (int i=0;i<str4Array.length;i++){
            System.out.println(str4Array[i]);
        }
        System.out.println("-----------------------");
    }
}
