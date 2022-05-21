public class Demo extends Animal{
    @Override
    public int sumofTwo(int n1, int n2) {

        return 100/n1;

    }

    @Override
    public int sunOfThree(int n1, int n2, int n3) {
        return n1+n2+n3;
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.sumofTwo(5,3));
        System.out.println(obj.sunOfThree(5,6,7));
        obj.disp();
    }
}
