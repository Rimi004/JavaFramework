package condition;

public class LargestNum {
    public static void main(String[] args) {
        // declaring double type variables
        Double n1 = 1.0, n2 = 8.0, n3 = 5.3, _final;

        if (n1 >= n2) {

            if (n1 >= n3) {
                _final = n1;
            }

            else {
                _final = n3;
            }
        }
        else {


            if (n2 >= n3) {
                _final = n2;
            }

            else {
                _final = n3;
            }
        }

        System.out.println("Final Number: " + _final);

        int num1= 30;
        int num2= 50;
        System.out.println(30%50);

    }
    }
