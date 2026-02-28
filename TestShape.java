import W3bg2.Circle;
import W3bg2.Rectangle;
import W3bg2.Shape;
import W3bg2.Square;


public class TestShape {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println(s);

        Circle c = new Circle(5.0, "red", false);
        System.out.println(c);
        System.out.printf("  Area=%.4f Perimeter=%.4f%n",
            c.getArea(), c.getPerimeter());

        Rectangle r = new Rectangle(4.0, 6.0, "yellow", true);
        System.out.println(r);
        System.out.printf("  Area=%.2f Perimeter=%.2f%n",
            r.getArea(), r.getPerimeter());

        Square sq = new Square(5.0, "purple", true);
        System.out.println(sq);
        sq.setWidth(10.0);
        System.out.println("Setelah setWidth(10): width=" + sq.getWidth()
            + " length=" + sq.getLength());
    }
}

