package string;

public class FirstTestString {

    public static void main(String[] args) {

        char c[]=new char[4];
        c[0]='j';
        c[1]='a';
        c[2]='v';
        c[3]='a';
        System.out.println(c[2]);




        // How to reverse a string:

        String str = "hello";
        StringBuffer stb = new StringBuffer(str);
        stb.reverse();
        System.out.println(stb);

        str.length();
        System.out.println(str.length());



        String s2 = "    hey";
        System.out.println(s2);
        s2.trim();
        System.out.println( s2.trim());


        // Using for loop to reverse string:

        String input = "Geekfor";
        int v = input.length();
        System.out.println(v);
        char[] sad = {'a','b','c','d'};
        int l = sad.length;

        for (int i=(input.length()-1);i>0;i--){
            System.out.print(input.charAt(i));
        }
        //System.out.print("G"); // This is called hard code








    }
}
