package W3;
import W3.Cylinder;
import W3.Circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("--- Cylinder 1 (default) ---");
        System.out.println(c1);
        System.out.printf("  radius=%.1f height=%.1f area=%.4f volume=%.4f%n",
            c1.getRadius(), c1.getHeight(), c1.getArea(), c1.getVolume());

        Cylinder c2 = new Cylinder(10.0);
        System.out.println("--- Cylinder 2 (height=10) ---");
        System.out.println(c2);
        System.out.printf("  radius=%.1f height=%.1f area=%.4f volume=%.4f%n",
            c2.getRadius(), c2.getHeight(), c2.getArea(), c2.getVolume());

        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("--- Cylinder 3 (radius=2, height=10) ---");
        System.out.println(c3);
        System.out.printf("  radius=%.1f height=%.1f area=%.4f volume=%.4f%n",
            c3.getRadius(), c3.getHeight(), c3.getArea(), c3.getVolume());

        // Test setColor (Instruksi A.1)
        c3.setColor("blue");
        System.out.println("Setelah setColor blue: " + c3);
    }
}
