public class SumOFDigitsInString {
/*
    String -- sum of digits in a string
    Write a method that can return the sum of the digits in a string

    Solution:


*/

    public static void main(String[] args) {
        System.out.println("sumOfDigits(\"S6G6G7G8\") = " + sumOfDigits("S6G6G7G8"));

    }
    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

              total += Integer.valueOf(""+each);                                                             // Since it's a char we have to use Integer. The method accepts a single parameter a of integer type representing the parameter whose Integer instance is to be returned.
              //  total = total + Character.getNumericValue(s.charAt(each));

            }

        }

        return total;

    }
}
