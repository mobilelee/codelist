public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {1,2,3,8,9,6,5,0};
        System.out.println(a[2]);
//        a = null;
//        System.out.println(a[0]);

        printArray(a);
//        int[] arr = new int[3];
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        int[] arr = {34,98,10,25,67};
        int Max = getMax(arr);
        System.out.println(Max);
        int Min = getMin(arr);
        System.out.println(Min);
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int x=0;x<array.length;x++){
            if (x==array.length-1){
                System.out.print(array[x]+"]");
            }else {
                System.out.print(array[x]+",");
            }
        }

    }

    public  static int getMax(int[] arr){
        int max = arr[0];
        for (int x=1;x<arr.length;x++){
            if(arr[x]>max){
                max = arr[x];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int x=1;x<arr.length;x++){
            if (arr[x]<min){
                min = arr[x];
            }
        }
        return min;
    }
 }
