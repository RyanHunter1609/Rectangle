import java.util.Objects;

public class Rectangle {

    private double length; // must be >= 0
    private double width; // must be >= 0

    public Rectangle() {
        length = width = 0;
    }

    public Rectangle(double len, double wid) {
        length = len >= 0 ? len : 0;
        width = wid >= 0 ? wid : 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        /*
        Note: comparing floating point values for EXACT equality
         */
        return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double len) {
        length = len >= 0 ? len : 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double wid) {
        width = wid >= 0 ? wid : 0;
    }

    public double getArea() {
        return length * width;
    }
}
