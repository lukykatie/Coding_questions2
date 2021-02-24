import java.util.Arrays;

public class ArrayPushZeroToEnd2 {

    public static class Practice {

        public static void main(String[] args) {
            // index:      0,  1  2   3  4 5  6  7  8 9  10  11
            int[] arr1 = {1, 0, 0, 0, 0, 7, 0, 10, 0, 0, 0, 2, 0, 3, 0, 4, 0};    // countZ: 4
            //     arr2:   1,  7           7
            System.out.println("movesZeros(arr) = " + Arrays.toString(movesZeros(arr1)));
        }

        // Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
        //Ex:
        // index:0, 1, 2, 3     4 5 6 7
        //arr:  {1 ,0, 2, 0,    3,0,4,0};  // 4
        //arr2: [1, 2, 3, 4,    0, 0, 0, 0]
        public static int[] movesZeros(int[] arr) {
            int[] arr2 = new int[arr.length];
            int zeroCount = 0;                // 1
            for (int i = 0; i <= arr.length - 1; i++) {
                if (arr[i] != 0) {
                    arr2[i - zeroCount] = arr[i];       // arr2 = {1}
                } else {
                    zeroCount++;
                }
            }

            return arr2;
        }
    }
}

