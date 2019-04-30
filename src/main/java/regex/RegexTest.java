package regex;

import java.util.Arrays;

public class RegexTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");
        int[] arr = new int[strArray.length];
        //把字符串数组变成int数组
        for (int i=0;i<strArray.length;i++){
            arr[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int j=0;j<arr.length;j++){
            sb.append(arr[j]).append(" ");
        }
        String result = sb.toString().trim();
        System.out.println("result: "+ result);
     }
}
