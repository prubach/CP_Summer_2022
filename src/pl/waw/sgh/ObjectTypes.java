package pl.waw.sgh;

public class ObjectTypes {
    public static void main(String[] args) {
//        int a = 5;
//        Integer b = 10;
//        Integer c = b;
//        Integer d = 125;
//
//        Integer[] myA1 = new Integer[3];
//        myA1[0] = 5;
//        myA1[1] = c;
//        c = 20;



        String s1 = "10";
        String s2 = s1;
        String s3 = "125";

        String[] myA1 = new String[3];
        myA1[0] = "5abc";
        myA1[1] = s2;
        s2 = "ab20";

    }
}
