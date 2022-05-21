package condition;

import java.util.Arrays;

public class ForloopTest {
    public static void main(String[] args) {

        int array[] = {10, 20, 25, 63, 96, 57};
        int size = array.length;
        Arrays.sort(array);
        String sy = Arrays.toString(array);
        System.out.println("sorted Array ::" + sy);
        int res = array[size - 1];
        System.out.println("largest element is ::" + res);


        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            System.out.println("The sum of array: " + sum);

            float avg = sum / array.length;
            System.out.println(avg);
        }


        // Fibonacci series
        int N = 7;
        int num1 = 0;
        int num2 = 1;
        for (int count = 0; count < N; count++) {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        System.out.println(";;;;;;;;");

        // How to find this string is a palindrome


        String str = "Radar", revstr="";
        int strlnth = str.length();
        for (int i = strlnth-1; i >=0;--i){
            revstr = revstr+str.charAt(i);
            System.out.println(revstr);
        }

    }


}







