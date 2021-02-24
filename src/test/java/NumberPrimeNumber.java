import oracle.security.crypto.core.math.Prime;

public class NumberPrimeNumber {

    /*
    Write a method that can check if a number is prime or not
    What are Prime Numbers? In math, prime numbers are whole numbers greater than 1,
    that have only two factors – 1 and the number itself.
     */

    public static void main(String[] args) {

        int num = 7;
        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " Is not a prime number");
        }
    }
}


