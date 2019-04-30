public class arrayTest {
    public static void main(String[] args) {
//        String[] arr = {"get", "post", "get", "get", "get", "get", "post", "get","post","get","get","post","post"};
//        int postcount = 0;
//        int getcount = 0;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].equals("post")){
//                postcount++;
//                System.out.println(arr[i]);
//            }
//            if(arr[i].equals("get")){
//                sb.append(arr[i]+",");
//            }
//            if (i<arr.length-1){
//                if(arr[i].equals("get") && arr[i+1].equals("post")) {
//                    getcount++;
//                    System.out.println(sb);
//                    sb.delete(0,sb.length());
//
//                }
//            }else if(i == arr.length-1){
//                if (arr[i].equals("get")){
//                    getcount++;
//                    System.out.println(arr[i]);
//                }
//            }
//    }
//        System.out.println("getCount:"+ getcount);
//        System.out.println("postCount:" + postcount);
        char[] chs = {'a','b','c','c'};
        arrange(chs,0,4);

    }
    public static boolean isSwap(char[] chs,int i,int N){

        if(i!=N){
            if (chs[i] == chs[N]){
                return false;
            }
        }
        return true;
    }

    public static void arrange(char[] chs, int start, int len) {
        if (start == len - 1) {
            for (int i = 0; i < chs.length; i++) {
                System.out.print(chs[i]);
            }
            System.out.println();
            return;
        }
        for (int i = start; i < len; i++) {
            char temp;

                 temp = chs[start];
                chs[start] = chs[i];
                chs[i] = temp;

                arrange(chs, start + 1, len);
                temp = chs[start];
                chs[start] = chs[i];
                chs[i] = temp;


//            System.out.println("start:"+start);

//            System.out.println("origin:"+String.valueOf(chs));
        }
    }
}
