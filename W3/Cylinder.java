package W3;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();           // Circle() -> radius=1, color=red
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);     // Circle(radius) -> color=red
        this.height = height;
    }

    public double getHeight() { return height; }

    // Instruksi B: Override getArea() -> luas permukaan tabung
    @Override
    public double getArea() {
        double baseArea = super.getArea(); // luas lingkaran alas
        return 2 * Math.PI * getRadius() * height + 2 * baseArea;
    }

    // Instruksi B: getVolume() menggunakan super.getArea() agar benar
    public double getVolume() {
        return super.getArea() * height; // gunakan luas alas lingkaran
    }

    // Instruksi C: Override toString()
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
             + " height=" + height;
    }
}
