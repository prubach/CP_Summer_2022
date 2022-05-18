package pl.waw.sgh.obj;

public class ManipulateRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setParams(5, 10);
        //r1.sideB = 8;
        //r1.sideA = 23;
        System.out.println("Surface: " + r1.calcSurface());
    }
}
