import java.util.ArrayList;
import java.util.List;

public class ArrayListSortAscending {

    /*
    java.util.ArrayList -- sorting in ascending
    Write a method that can sort the ArrayList in Ascending order without using the sort method
    Solution:
*/
    
    public static void SortingArrayListAsc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

    }
}