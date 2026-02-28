package W3bg2;

public class Square extends Rectangle{
    public Square() { super(1.0, 1.0); }
    public Square(double side) { super(side, side); }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Override setWidth/setLength agar persegi tetap terjaga
    @Override
    public void setWidth(double side) {
        super.setWidth(side); super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side); super.setLength(side);
    }

    // getArea() dan getPerimeter() tidak perlu di-override karena
    // sudah diwarisi dari Rectangle dan tetap benar untuk persegi.

    @Override
    public String toString() {
        return "A Square with side=" + getWidth()
             + ", which is a subclass of " + super.toString();
    }
}


