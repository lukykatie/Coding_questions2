import java.util.*;

public class Map_frequencyofEachcharacter {

//Write a method that prints the frequency of each character from a String


    public static void main(String[] args) {


        String str = "aaabbbbccd"; //a3b4c2d1   //key of map must be unique
        // key is the charctacter, //frequency is the value
        Map<String, Integer> map = new LinkedHashMap<>(); //{a=3, b=4, c=2} //LinkedHasMap keeps insertion order

        //in order to use frequency method from collections utility need to
        //i can creat a collect by storing each charcter in a list
        //i use split method to put characters into arrays list
        List<String> list = Arrays.asList(str.split(""));
        System.out.println(list);

        //to get acces to each value from the list and then get thri frequency
      //  i can use for each loop in order to acces every value


        for(String each: list){  //each a,a,a,b,b,b,b,c,c,d
            int frequency = Collections.frequency(list, each);  //frquency is always integer
                                                //collection type: list  //need to find frequency of each
            map.put(each, frequency); //i use put method to put character and frquency into map

        }

        System.out.println(map);


    }
}

