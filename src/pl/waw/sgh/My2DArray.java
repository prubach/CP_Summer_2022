package pl.waw.sgh;

public class My2DArray {
    public static void main(String[] args) {
        Double[][] my2Darr = new Double[3][4];
        my2Darr[0] = new Double[] {4.0, 5.5, 67.0, 77.0};
        my2Darr[1][0] = 655.0;
        my2Darr[1][1] = 65.0;
        my2Darr[1][2] = 40.9;
        my2Darr[1][3] = 60.0;
        my2Darr[2] = new Double[] { 3.0, 5.9, 9.4, 8.0};

        for (int i=0;i<my2Darr.length;i++) {
            // my2Darr[i] - array = row
            for (int j=0;j<my2Darr[i].length;j++) {
                System.out.println("El at [" + i + ", " + j + "]: " + my2Darr[i][j]);
            }
        }

    }
}
