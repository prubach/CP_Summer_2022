package pl.waw.sgh;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from java");

        int a;
        a = 34636;
        System.out.println(a);

        boolean b1 = true;
        System.out.println(b1);

        char c1 = 'r';
        char c2 = 69;
        System.out.println(c2);

        int[] ar1 = new int[3];
        float[] far1 = new float[5];
        far1[0] = 252.2552f;
        System.out.println(far1[0]);

        ar1[0] = 500;
        System.out.println(ar1[0]);
        System.out.println(ar1[1]);
        System.out.println(ar1[2]);

        long l1 = 4252245637525263635L;
        System.out.println(l1);
        byte b2 = 98;
        int i1;
        i1 = b2;
        System.out.println(i1);
        i1 = 130;
        byte b3;
        b3 = Integer.valueOf(i1).byteValue();
        System.out.println(b3);



        // write your code here
    }
}
