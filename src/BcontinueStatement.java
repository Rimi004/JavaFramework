public class BcontinueStatement {
    public static void main(String[] args) {
        for (int j = 0; j < 6; j++) {
            if (j == 4)
            {continue;
               // break;
            }
            System.out.print(j+" ");

        }
        System.out.println();

        int ch='P';
        int aschiicode =ch;
        int aschiivalue =(int)ch;   // type casting character as int
        System.out.println(aschiicode);
        System.out.println(aschiivalue);

        //Add two number:
        int num1=10, num2=20,sum=num1+num2;
        //sum=num1+num2;
        System.out.println("sum of these two numbers: "+sum);

        //Assignment operators:
        int d=15;
        int e=30;
        e=d;
        System.out.println("=output: "+e);

        e+=d;
        System.out.println("+output: "+e);

        e-=d;
        System.out.println("-output: "+e);

        e*=d;
        System.out.println("*output: "+e);

        e/=d;
        System.out.println("output: "+e);

        e %=d;
        System.out.println("/output: "+e);




        // IF ELSE CONDIDION:

        int num= 60;
        if (num<100){
            System.out.println("number is less than: "+100);

        }

        int r,sums=0,temp=98,po;











    }
}
