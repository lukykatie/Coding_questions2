import java.util.*;

public class MapUniqueCharacter {



    /*
    2. write a program that stores the unique characters from a string into a map

        Ex:
            str = "abacbdeef";
            output:
                {c=1, d=1, f=1}

     */

        public static void main(String[] args) {


            String str = "aabbbcdnf";

            Map<String, Integer> map=new LinkedHashMap<>();  //  {c=1, d=1, f=1}
            List<String> list = Arrays.asList(str.split(""));


            for(String each: list){  //each: abacbdeef
                if(Collections.frequency(list, each)==1){
                    map.put(each, 1);
                }

            }
            System.out.println(map);

            System.out.println(map.containsKey("j"));
        }
    }



