package Competive_Programming;

public class min_max_sum {

//    * The maximum sum for each index is [0, 0, 3, 7, 12, 18, 25, 33].
//            ,-3, -3, -3]
//
//
//
//            * The minimum sum for each index is [-1, -3, -3, -3,
//
//    The answer is [0, 0, 3, 7, 12, 18, 25, 33] + [-1, -3, -3, -3, -3, -3, -3, -3] = [-1, -3, 0, 4,
//            9, 15, 22, 30].

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    min += arr[j];
                }
            }
            if (i == 0) {
                max = min;
            }
            if (min > max) {
                max = min;
            }
            min = 0;
        }
        System.out.println(min + " " + max);
    }
}
