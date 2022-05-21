package string;

import java.util.Locale;

public class StringCompare {
    public static void main(String[] args) {

        String s1 ="hi";
        String s2 = "hi";
        String s3 = new String("Hi");
        String s4 = new String("Hi");


        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3==s4);

        String st = "hello";
        String st1 = "Hello";
        System.out.println(st.equals(st1));
        System.out.println(st.equalsIgnoreCase(st1));
        String ST = new String("hello");
        String ST1 = new String("hello");
        System.out.println(ST.equalsIgnoreCase(ST1));
        System.out.println(ST1==ST);
       // Methods of Strings:
        //1. toUppercase() and toLowercase()
        String s5 = "Hello";

        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());

        // 2. Trim()
        System.out.println(s5.trim()); // It only trims "" gape
        // 3. startsWith() and endsWith()
        System.out.println(s5.startsWith("H"));
        System.out.println(s5.endsWith("O"));
        //4. charAt()
        System.out.println(s5.charAt(2));


//******************** IF ELSE***************/





    }
}

