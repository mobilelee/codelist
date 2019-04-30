package String;

public class StringTest3 {
    public static void main(String[] args) {
        String s = "hELLoWoRLD";
        String s1 = s.substring(0, 1);
        String s2 = s.substring(1);
        System.out.println(s1.toUpperCase().concat(s2.toLowerCase()));
        System.out.println("--------------------");

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(arrayToString(arr));
        System.out.println("--------------------");

        String maxString = "woaiJavawozhendehenaiJavashizhendezhendehenaiJavagun";
        String minString = "Java";
        System.out.println(getCount(maxString,minString));


    }

    public static String arrayToString(int[] arr) {

        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
                s += "]";
            } else {
                s += arr[i];
                s += ", ";
            }
        }
        return s;
    }
    public static int getCount(String maxString ,String minString){
        int count = 0;
        int index ;
        while ((index = maxString.indexOf(minString))!=-1){
            count++;
            int startIndex = index + minString.length();
            maxString = maxString.substring(startIndex);
        }
        return count;
    }

}
