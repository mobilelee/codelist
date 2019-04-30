public class Array2Demo {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        /**
         * 外循环是二维数组的长度
         */
        for (int i=0;i<arr.length;i++){
            for (int x=0;x<arr[i].length;x++){
                System.out.print(arr[i][x]);
                sum+= arr[i][x];

            }
            System.out.println();
        }
        System.out.println(sum);

//        /**
//         * 二维数组求和
//         */
//        int sum=0;
//        for (int j=0;j<arr.length;j++){
//            for (int y=0;y<arr[j].length;y++){
//                System.out.print(arr[j][y]);
//
//                sum = sum + arr[j][y];
//
//            }
//            System.out.println(sum);
//            System.out.println();
//        }
    }
}
