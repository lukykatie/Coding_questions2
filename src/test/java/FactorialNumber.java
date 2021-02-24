import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        /* write a proigramm that return the factorial number of any give number
         *
         * inout: 5;
         * output: 120;
         * because: 5! = 5*4*3*2*1 = 120; */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));

    }
    public static int factorial(int n){

        int result = 1; //5 *4 *3 *2 *1 == 120

        for(int i = n; i>=1; i -- ){
            result *=i;  //indefinite multiplication

        }
        return result;


    }
}


