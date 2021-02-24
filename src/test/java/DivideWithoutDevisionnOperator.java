public class DivideWithoutDevisionnOperator {

/*
    Write a method that can divide two numbers without using division operator

    Solution:

 */

    public static void devides(int num1, int num2) {

        if(num2==0) {

            System.out.println("Invalid Number");

            return;

        }

        System.out.print(num1 +" devided by "+num2 +" is: ");

        int count =0;   //how many times we have num2 inside of num1

        while(num1 >= num2) {

            num1 -= num2;  //we continue subtracting num2 from num1 untill there is jonlya remainder left
            count++;

        }

        System.out.println(count+" and remainder is "+num1);

    }
}
