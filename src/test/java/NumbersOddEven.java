import java.util.Scanner;

public class NumbersOddEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scan.nextInt();

        EvenorOdd(a);


    }

    public static void EvenorOdd(int num){
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }

}


