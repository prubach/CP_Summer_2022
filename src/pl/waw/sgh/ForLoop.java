package pl.waw.sgh;

public class ForLoop {

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            if (i==4) continue;
            System.out.println("For i=" + i);
            if (i==7) break;
        }
    }
}
