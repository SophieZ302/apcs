import java.util.Arrays;

import javax.security.sasl.SaslServer;

/**
 * Created by Sophie Zhang on 1/14/21.
 */
public class Array {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, -2};

        //input int: 669260267
        //output int: 6
        //input int: 57135203
        //output int: 3
        Array array = new Array();
        int rst = array.mostFrequentDigit(669260267);
        System.out.println(rst);

        //System.out.println(Arrays.toString(numbers));
    }


    //Algorithm for finding the largest element
        /*
        0. largest
        0.5 idx_largest
        1. largest = first_number;
           start at index = 0, first_number = numbers[index];

        2. (check if index is out of bound)
           if not index++, next_number = numbers[index];
           else: termination, return idx of largest value

        3. if (next_number <= largest) {
              go to step #2
           } else {
              largest = next_number;
              go to step #2
           }
         */


        //test case: int[] numbers = {1, 3, 5, -2};
        //expected output: 2
    public static int largest(int[] array) {
        int largest = array[0];
        int idx = 0;
        for(int i = 1; i < array.length; i++) {
            int next_number = array[i];
            if (next_number > largest){
                largest = next_number;
                idx = i;
            }
        }
        return idx;
    }

    //test case: int[] numbers = {1, 3, 5, -2};
    //expected output: 7/4
    public static double average (int[] array) {
        /* 1. sum
           2. go though the array to sum it up
           3. divide by length
         */
        int sum = 0;
        for(int item : array) {
            sum = sum + item;
        }
        return  (double) sum / array.length;
    }

    //test case: int[] numbers = {1, 3, 5, -2};
    //expected output: {-2, 5, 3, 1}
    public static void reverse (int[] array) {
        // start from last number
        // go back one by one
        // stop in the middle
        // array.length/2
        // if odd
        // len 5 , len/2 = 2, {0,1,2,3,4}
        // {0,4} {x, y, len=5 - 1}
        // {1,3}
        // {2,2}
        // else
        // len 4, len/2 = 2,  {0,1,2,3}
        // {0,3}
        // {1,2}
        int start = 0;
        for(int i = array.length - 1 ; i >= array.length / 2; i--) {
            //swap
            int a = array[start];
            array[start] = array[i];
            array[i] = a;
            start++;
        }
    }


    //input int: 669260267
    //output int: 6
    //input int: 57135203
    //output int: 3
    public int mostFrequentDigit(int number){
        //getting digit from number
        //example: 10
        //1. cur_digit = number % 10 to get remainder (1)
        //2. number = number / 10 (0)
        // stop when number == 0

        //int[] count = new int[10] indices[0,1,2,3.....9]
        //count number of times it appeared
        // every time encountering cut_digit, increment counter
        //count[cut_digit]++;

        int[] count = new int[10];
        while (number != 0) {
            int cur_digit = number % 10;
            number = number/10;
            count[cur_digit]++;
        }


        //finding the most Frequent Digit
        //if ties, return the smallest
        int largest = count[0]; //largest frequency
        int idx = 0; //actual number

        for(int i = 1; i < count.length; i++) {
            int next_number = count[i];
            if (next_number > largest){
                largest = next_number;
                idx = i;
            }

            if (next_number == largest) {
                //value of next_number = i
                //value of largest = idx
                idx = Math.min(i, idx);
            }
        }

        return idx;
    }
}
