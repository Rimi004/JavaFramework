package condition;

public class IfExample {
    public static void main(String[] args) {
//        int i = 10;
//        if(i<0 && i>-2){
//            System.out.println("i is negative");
//        }
//        else if (i>0){
//            System.out.println("i is positive");
//        }

        // IF statement:

        int num = 100;
        if (num>101){
            System.out.println("This is wrong");

        }
        if (num<101){
            System.out.println("This is right");
        }

        // Nested IF:

        int num1 = 300;
        if (num1<300){
            System.out.println("Nested is right");

            if(num1>300){
                System.out.println("nested is wrong");
            }
        }

        if(num1>=300){
            System.out.println("now nested correct");

             if(num1<300){
                System.out.println("Only nested");

                if(num1<305){
                    System.out.println("This nested right");
                }
            }
        }

        // IF Else statement:

        int num2=500;
        if(num2<500){
            System.out.println("num2 is right");
        }
        else {
            System.out.println("Not come to else");
        }


        if(num2<505){
            System.out.println("Num2 is right");
        }
        else {
            System.out.println("now else wrong");
        }

        // IF-ELSE IF statement:

        int num3=250;

        if(num3>400){
            System.out.println("Num3 is wrong");
        }
        else if (num3<400){
            System.out.println("Num3 is right");
        }
        else {
            System.out.println("Else will not reach");
        }


        int num4=450;
        if(num4>400){
            System.out.println("Num4 is wrong");
        }
        else if (num4<400){
            System.out.println("Num4 is not right");
        }
        else if (num4>500){
            System.out.println("Else if will not reach");
        }
        else if (num4>=550){
            System.out.println("This is also wrong");
        }
        else{
            System.out.println("The last will be printed");
        }

        int x = 10;
        int y =20;
        int choice = 0;

        if (choice==1){
            System.out.println(x+y);
        }

        else if (choice==2){
            System.out.println(x-y);
        }

        else if(choice==3){
            System.out.println(x*y);
        }
        else if(choice==4){
            System.out.println(x/y);
        }
        else {
            System.out.println("invalid");
        }

        int a =69;
        if (a==69){
            System.out.println("fuck");
        }

        else {
            System.out.println("love");
        }
















    }
}
