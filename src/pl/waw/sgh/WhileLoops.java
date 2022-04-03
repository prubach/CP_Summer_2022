package pl.waw.sgh;

public class WhileLoops {

    public static void main(String[] args) {
        boolean my_cond = true;
        int i = 12;
        while (i<10) {
            System.out.println("Hello i=" + i);
            i++;
            if (i==5) break;
        }

        int j = -5;
        do {
            System.out.println("Do While: j=" + j);
            j--;
        } while (j > 0);

    }
}
