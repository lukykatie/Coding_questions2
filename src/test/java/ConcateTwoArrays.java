import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ConcateTwoArrays {

  //  Array -- Concat two arrays Write a return method that can concate two arrays

    public static void main(String[] args) {

        int[] arr1 = {1,2,3, 4,5,6,78,98,12,12,1321,312,321,112};
        int[] arr2 = {4,5,4,5,6,7,8,9,0};
        int size = arr1.length + arr2.length;

        int[] arr3 = new int[size]; // 5

        int index = 0;

        for(int each: arr1){
            arr3[index] = each ;
            index+=1;
        }
        for(int each: arr2){
            arr3[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(arr3) );

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3) );

        System.out.println("Maximum: "+arr3[arr3.length-1]);

    }

    //ALETRNATIVE METHOD

    static void concateTwoArrays2(){

        String []a1 = {"Tetiana", "Hamit", "Phornsri"};
        String []a2 = {"Aaola", "Zaki", "Cristina", "Dawit"};
        String [] students = new String[a1.length+a2.length];

        for(int i =0; i<=a1.length-1; i++){
            students[i]= a1[i];

        }
        for(int i =0; i<=a2.length-1; i++){
            students[i+a1.length]=a2[i];
        }
        System.out.println(Arrays.toString(students));

    }
    //ALETRANTIVE METHOD
    static void concateTwoArrays(){
        char[] a1 = {'A', 'B', 'C'}; // i: 0, 1, 2
        char[] a2 = {'D', 'E', 'F', 'G', 'H', 'I', 'J'}; //J: 0, 1, 2, 3, 4, 5, 6

        char[] a3 = new char[ a1.length+a2.length ]; // j+a1.length: 0,1,2, 3,4,5,6,7,8,9

        for(int i = 0; i <= a1.length-1; i++){
            a3[i]  = a1[i];
        }
        for(int j = 0; j <= a2.length-1; j++ ){
            a3[j+a1.length] = a2[j];
        }
        /*
        int j = 0;
        while(j <= a2.length-1){

            a3[index] = a2[j];
            index++;
          j++  ;
        }
*/
        System.out.println(Arrays.toString(a3));

    }

}





