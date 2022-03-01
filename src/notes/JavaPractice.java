package notes;

import java.util.Arrays;

public class JavaPractice {
    public static void main(String[] args) {
        //Write a program that creates an array, and then prints the sum of the even and odd integers in a new array [sumOdd, sumEven]
        //example: [2,4,8,5,1,2];
        //output; [6,16]
        //reason: 2+4+8+2 = 16
        //5+1 = 6 (edited)

        arraySum();
    }

    public static void arraySum() {
        int[] arrayOfNums = {2,4,8,5,1,2};
        int[] oddEven = new int[2];

        int even = 0;
        int odd = 0;
        for(int num : arrayOfNums) {
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        oddEven[0] = odd;
        oddEven[1] = even;
        System.out.println(Arrays.toString(oddEven));
    }
}
