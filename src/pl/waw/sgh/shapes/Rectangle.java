package pl.waw.sgh.shapes;

import java.util.Objects;

public class Rectangle {
    private Double parA = 0.0;
    private Double parB = 0.0;

    public Rectangle() {
        this(40.0, 20.0);
    }

    public Rectangle(Double parA, Double parB) {
        setParams(parA, parB);
    }

    public void setParams(Double a, Double b) {
        this.parA = a;
        this.parB = b;
    }

    public Double calcSurface() {
        return parA*parB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(parA, rectangle.parA) && Objects.equals(parB, rectangle.parB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parA, parB);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}
