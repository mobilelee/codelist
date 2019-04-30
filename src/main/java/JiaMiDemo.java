public class JiaMiDemo {
    public static void main(String[] args) {

        int[] arr = new int[8];
        int number = 1234567;
        int index = 0;

        while (number>0){
            arr[index] = number%10;
            index++;
            number/=10;
        }
        for (int i=0;i<index;i++){
            arr[i] +=5;
            arr[i] %=10;
        }
        int temp = arr[0];
        arr[0] = arr[index-1];
        arr[index-1] = temp;

        for (int i=0;i<index;i++){
            System.out.print(arr[i]);
        }

    }
}
