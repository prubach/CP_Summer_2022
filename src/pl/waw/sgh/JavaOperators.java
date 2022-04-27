package pl.waw.sgh;

public class JavaOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 10 % 7;
        System.out.println("c=" + c);

        int d = 1;
        d++;
        ++d;
        System.out.println("d=" + d);
        int e;
        //e = d++;
        e = ++d;
        System.out.println("e=" + e);
        System.out.println("d=" + d);

        System.out.println("-------------");
        float f;
        f = 10/7;
        System.out.println("f=" + f);

        f = 10.0f/7.0f;
        System.out.println("f=" + f);

        System.out.println("-------------");

        int g1, g2, g3;
        g1 = 234525525;
        g2 = 100000;
        g3 = g1*g2;
        System.out.println("g3=" + g3);

        long g4;
        long g5 = g1;
        long g6 = g2;
        g4 = g5*g6;
        System.out.println("g4=" + g4);

        System.out.println("-------------");

        boolean p, q, r, s, t;
        p = false;
        q = true;
        r = p && q; // AND
        s = p || q; // OR
        t = p ^ q; // XOR
        System.out.println("r=" + r);
        System.out.println("s=" + s);
        System.out.println("t=" + t);

        System.out.println("-------------");
        int aa, bb;
        aa = 10;
        bb = 20;
        boolean u, v, z;
        z = aa != bb;
        System.out.println("z=" + z);

        int w;
        w = aa >= bb ? 100 : -100;
        System.out.println("w=" + w);

        // My change

    }
}
