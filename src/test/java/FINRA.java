public class FINRA {

    /* write a method that prints numbers frpm 1 to 30, but for num which
ae multiple of 3, print "FIN"
instead of the number and for numbers which are multiplr of 5 print :"RA"
instead of the number for numbers which are a multiple of both 3 and 5, print "FINRA"



 */
    public static void main(String[] args) {


        for(int i = 1; i >= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {  // if num is divisible by 3 & 5 we print FINRA
                System.out.println("FINRA");
            } else if (i % 3 == 0) {  //if num is only divisible by 3
                System.out.println("FIN");
            } else if (i % 5 == 0) {  // if num is only divisible by 5
                System.out.println("RA");
            } else {   //otherwise
                System.out.println(i+ " ");
            }
        }
    }
}
