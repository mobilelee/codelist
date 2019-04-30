package paixu;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] arr = {24,69,80,57,13};
        System.out.println("排序前：");
        printArray(arr);
//        bubbleSore(arr);
//        xxx(arr);
        String s = "dacgebf";
        char[] chs = s.toCharArray();
        bubbleSore(chs);
        String result = String.valueOf(chs);
        System.out.println(result);
//        System.out.println("排序后：");
//        printArray(arr);

    }
    //数组遍历功能
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if (i == arr.length-1){
                System.out.println(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }
    //冒泡排序
    public static void bubbleSore(char[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //选择排序
    public static void xxx(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
