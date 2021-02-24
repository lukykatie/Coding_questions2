import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {


        reverse("Katie");
    }

    public static void reverse(String str) {         //we create “reverse” method and provide string as a parameter
        String result = "";                         //we create an empty variable
        for (int i = str.length() - 1; i >= 0; i--) {                       //we create a regular for loop and start with last index and stop at 0
            result += str.charAt(i);                                      //we concate it to the “result”
        }
        System.out.println(result.toUpperCase());

    }



    public static void reverse2(String str2) {

        // avaJ ==> ava , J

        String s1 = str2.substring(1);  //"ava"

        String s2 = str2.substring(0, 1); //"J"

        // char ch1 = str.charAt(0);

        String result1 = s1 + s2; // "avaJ"

        System.out.println(result1);
    }
}



