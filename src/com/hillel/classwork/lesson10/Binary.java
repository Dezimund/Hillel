package classwork.lesson10;

public class Binary {
    public static void main(String[] args) {

        int i =45;

        System.out.println(i + " " + Integer.toBinaryString(i));

        int res = ~i;
        System.out.println(res + " " + Integer.toBinaryString(res));

        int i1 = 56;
        System.out.println(i1 + " " + Integer.toBinaryString(i1));
        int and = i & i1;
        System.out.println(and + " " + Integer.toBinaryString(and));

        int or = i | i1;
        System.out.println(or + " " + Integer.toBinaryString(or));
    }
}
