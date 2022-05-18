package pl.waw.sgh.obj;

public class Rectangle {
    private int sideA = 454;
    private int sideB = 4;

    public Rectangle() {
        sideA = 100;
        sideB = 2;
    }

    public void setParams(int a, int b) {
        if (a>0 && b>0) {
            this.sideA = a;
            sideB = b;
        } else {
            System.out.println("a and b must be > 0");
        }
    }

    public int calcSurface() {
        return sideA*sideB;
    }
}
