import java.util.*;

public class FrequencyOfChars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //comment
        String str = scan.next();    //ABABCAB

        String nonDup = "";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {         //to iterate every single character in the string
           String ch = "" + str.charAt(i);             // to retrieve every single character from the String
            if (!nonDup.contains(ch)) {              //if nonDup doesn’t contain a character
                nonDup += ch;                        //concate it to nonDup
            }

        }
        System.out.println(nonDup);                 //print nonduplicates only

        for (int j = 0; j <= nonDup.length() - 1; j++) {  //to find frequency of each character to repeat steps below

            char ch = nonDup.charAt(j); // A
            int count = 0; // contains frequeancy: 2,2,2
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {                                    //we check if character from nonDup contains in str
                    count += 1;
                }
            }
            result += "" + ch + count;
        }
        System.out.println(result.toUpperCase());

    }
/// SOLUTION TWO
    public static String frequency(String str){

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(""))); //add it to an array LIst
        LinkedHashSet<String> nonDup = new LinkedHashSet<>(list);  //linkedhasset removed duplicates

        String result ="";
        for(String each : nonDup){
            int count = Collections.frequency(list, each);
            result+=each+count;
        }
        return result;

    }
}

