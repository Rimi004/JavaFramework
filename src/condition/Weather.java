package condition;

import java.util.Arrays;

/*Write a program that will display the weather report. Below is the criteria:
1. If the temperature is equal to or above 40, you should display "Super Hot"
2. If the temperature is between 30(including) and 40 , you should display "Hot"
3. If the temperature is between 25(including) and 30 , you should display "Comfortable"
4. If the temperature is between 15 and 25 , you should display "Cold"
5. If the temperature is equal to or below 15, you should display "Super Cold"
 */
public class Weather {
    public static void main(String[] args) {
        int temp = 28;

        if (temp >= 40) {
            System.out.println("Super hot");
        } else if (temp >= 30 && temp < 40) {
            System.out.println("Hot");
        } else if (temp >= 25 && temp < 30) {
            System.out.println("Display:+comfortable");
        } else if (temp > 15 && temp < 25) {
            System.out.println("Display:+cold");
        } else if (temp <= 15) {
            System.out.println("Super cold");
        } else {
            System.out.println("tmr matha");
        }


        // FIND LARGE NUMBER:

        int a = 10, b = 20, c = 25, largenum;

        if (a >= b) {
            if (b >= c) {
                largenum = a;
            } else {
                largenum = c;

            }
        } else {
            if (b >= c) {
                largenum = b;
            } else {
                largenum = c;
            }
        }
        System.out.println("Largenum:" + largenum);


        System.out.println("////////");

        int p = 10, q = 13, r = 15, s = 20;

        if (p < q) {
            if (p < r) {

                System.out.println("smallest:" + p);
            } else {
                System.out.println("smallest:" + r);
            }
        } else {
            if (q < r) {
                System.out.println("smallest:" + q);
            } else {
                System.out.println("smallest:" + r);
            }
        }


        System.out.println(".......");


        if (p > q) {
            if (p > r) {
                if (p > s) {
                    System.out.println("Largest:" + p);
                } else {
                    if (s > r) {
                        System.out.println("Large:" + s);
                    } else {
                        System.out.println(r);
                    }

                }

            }
        } else {
            if (q > p) {
                if (q > r) {
                    if (q > s) {
                        System.out.println("large:" + q);
                    }
                }
            } else {
                if (s > r) {
                    System.out.println("Large:" + s);
                } else {
                    System.out.println("large:" + r);
                }
            }


        }
    }
}




