import java.util.Arrays;

public class Test4 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 34, 5, 66, 7, 7,};
        int[] arr2 = {865, 44, 2, 3, 1, 3, 5,};


        System.out.println(Arrays.toString(concateArr(arr1, arr2)));

    }
public static int [] concateArr(int[]arr1, int[]arr2){

        int size = arr1.length+ arr2.length;
        int[]arr3 = new int[size];

        int index = 0;

        for(int each: arr1 ){
            arr3[index]=each;
            index+=1;
        }
        for(int each: arr2){
            arr3[index]=each;
            index++;
        }


return  arr3;
    }
    }

