public class FindUnique {

    public static void main(String[] args) {

        unique("aabccdeefgghijkl");
        // "bdfhijkl"

    }
        public static void unique(String str) {


                String uniques = "";  //"b"

                for(int i = 0; i <= str.length()-1; i++ ){

                    char ch = str.charAt(i);         //  a  a  b  c  c  '' to get every character we use charAt method
                    int first = str.indexOf(ch);    //   0  0  2  3  3  //returns first occured index //use indexOf method
                    int last = str.lastIndexOf(ch); //   1  1  2  4  4  //returns last occuered index

                    if(first == last){
                        uniques += ch;
                    }
                }

                System.out.println(uniques);

            }

            //SECOND METHOD

    public static void unique2(String str) {

        String expectedResult = "";     // "bdfhijkl

        for(int j = 0; j <= str.length()-1; j++){ // because we need the frequency of every single character

            char ch1 = str.charAt(j); // a then a and b and  c and c   //assign char to a char variable

            int count1 = 0; // 1+1  // frequnecy of ch
            for(int i = 0; i <= str.length()-1; i++){  // used for finding the frequnecy of ch and assign it to count
                char each = str.charAt(i);  // a  a  b  c  c  //represnts each character of the string

                if(ch1 == each){      //if char ch1 matches with the each character of the string
                    count1+=1;       //we increase count by 1 if ch1 = each
                }
            }

            if(count1 == 1 ){ // if it only occured one time means this character is unique
                expectedResult += ch1;
            }

        }

        System.out.println(expectedResult);


    }

}


