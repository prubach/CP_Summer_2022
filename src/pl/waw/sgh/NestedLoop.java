package pl.waw.sgh;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i=0;i<5;i++) {
            for (int j=0;j<5;j++) {
                System.out.println("ij = " + i +"_" + j);
            }
            System.out.println("incrementing i");
        }
    }
}
