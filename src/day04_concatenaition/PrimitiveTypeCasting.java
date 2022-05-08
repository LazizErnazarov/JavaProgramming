package day04_concatenaition;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {
        // ------------Implicit casting ----------------

        byte a = 15;

        short b =a;
        // short b = (short)a;

        int c = a; // Implicit casting
        System.out.println(b);
        long d = 3000L;
        float f = d; //Implicit casting

        //---------explicit casting-------------

        int x = 100;

        byte y = (byte)x; //explicit casting

        float z = 20.8f;
        short q = (short) z; //z = 20.8

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1; //n1 = 2.5

        System.out.println(n2);

        int num = 500;

        byte result = (byte) num; // explicit casting

        int r =50000;

        short t = (short) r;

        System.out.println(t);

        double u =3000.5;

        int p = (int) u; // explicit casting
        System.out.println(p);

        int o = 100;
        double d1 = o;

        System.out.println(d1);







    }
}
