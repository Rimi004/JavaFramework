public class B extends A{
    B(){
        System.out.println("inside constructor B");
    }
    //Final keyword, access modifier (public,private,protected), Super, Abstraction, Interface

    //String, Arraylist

    //This, Finally, Finalize, Encapsulation,



    public void method3() {
        super.method1();   // we can call parent class's method by super keyword
    }

    public static void main(String[] args) {
        A objA = new A();
        objA.method1();
        B objB = new B();
        objB.method1();
        B.method2();
        final int j = 4; // FINAL
        int k = 90;

        System.out.println(j);
        objB.method1();

    }
}
