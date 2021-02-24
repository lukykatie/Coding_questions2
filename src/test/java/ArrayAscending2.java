import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAscending2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));
        list = sortingArray(list);
        System.out.println(list);
    }
    public static List<Integer> sortingArray (List<Integer> list){
        for(int i=0; i<list.size(); i++){//'i' is comparing to 'j'
            for(int j=0; j<list.size(); j++){//when value at the 'i' index is greater than value at 'j' index, the values are swapped
                if(list.get(i)>list.get(j)){//and comparison continues
                    Integer temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}

