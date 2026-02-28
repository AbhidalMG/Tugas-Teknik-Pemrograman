package W3;
public class Circle {
    private double radius;
    private String color;

    // Constructor default
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // Constructor dengan radius
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // Constructor tambahan: radius + color (Instruksi A.1)
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() { return radius; }
    public String getColor()  { return color; }
    public void setColor(String color) { this.color = color; }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
