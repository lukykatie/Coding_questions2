import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    /*
    Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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

    }

    public static String removeDup(String str) {

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

        str = str.replace(", " ,  "" ).replace("[","").replace("]","");

        return  str;

    }
}
