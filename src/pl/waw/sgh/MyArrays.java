package pl.waw.sgh;

public class MyArrays {

    public static void main(String[] args) {
        int[] myArr1 = { 67, 564, 743, 567, 76 };
                //new int[5];
        //myArr1[0] = 6;
        myArr1[1] = 8;
        //myArr1[2] = 9;

        for (int el : myArr1) {
            System.out.println(el);
        }

        System.out.println();

        Integer[] myArr2 = new Integer[5];
        myArr2[0] = 6;
        myArr2[1] = 8;
        myArr2[2] = 9;

        for (Integer el : myArr2) {
            System.out.println(el);
        }
    }
}
