package paixu;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
        int index = getIndex(arr,44);
        System.out.println("index:" + index);
    }

    //二分查找
    public static int getIndex(int[] arr,int value){
        int min = 0;
        int max = arr.length-1;

        int mid = (max+min)/2;
        while (arr[mid] != value){
            if (arr[mid] > value){
                max = mid - 1;
            }else {
                min = mid + 1;
            }

            //加入判断，否则会陷入死循环
            if (min>max){
                return -1;
            }
            mid = (max+min)/2;
        }
        return mid;
    }
}
