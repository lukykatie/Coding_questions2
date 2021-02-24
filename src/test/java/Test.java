import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> abc = new ArrayList<>(Arrays.asList(6,54,67656,2,23345,7,4));
        removeNumber(abc);


}

public static void removeNumber(ArrayList<Integer> list){

  //      list.removeIf(each->each%2==0);





        ArrayList<Integer> list2 = new ArrayList<>();



        for(int each: list){
            if(each<100){
                list2.add(each);
                list=list2;

            }
        }


    System.out.println(list);
}



}

