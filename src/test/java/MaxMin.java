public class MaxMin {


        public static void main(String[] args) {
            int[] arr = {5,5,4,6,4,1, -100, 100, 200, 3000, -3000};
            int max = arr[0]; // assign first element of the array to max variable
            int min = arr[0]; // assign first element of the array to min variable

            for(int i = 1; i <= arr.length-1; i++){  // we start from 1 bc we don't have to compare index 0 with index o assigned to max or min

                if(arr[i] > max){ // compares the array' elemnts, and assign the maximum number to variable max
                    max = arr[i];
                }

                if(arr[i] < min){
                    min = arr[i];
                }
            }

            System.out.println("Max Number: "+max);
            System.out.println("Min Number: "+min);

        }
    }

