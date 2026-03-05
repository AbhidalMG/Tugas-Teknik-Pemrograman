package PRAKTIK2;

public class Cylinder extends Shape{
    private double radius; //radius in feet
    private double height; //height in feet

    //----------------------------------
    // Constructor: Sets up the cylinder.
    //----------------------------------
    public Cylinder(double r, double h)
    {
        super("Cylinder");
        radius = r;
        height = h;
    }

    public double area()
    {
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public String toString()
    {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
    
}
