
    public class DebugCircle
    {
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;
    public DebugCircle(int r)
    {
    radius = r;
    diameter = 2 * r;
    area = PI * r * r;
    }
    public int getRadius()
    {
    return radius;
    }
    public int getDiameter()
    {
    return 2 * diameter;
    }
    public double getArea()
    {
        System.out.println("The radius is  "+ radius + "\n"
    + "The diameter is  " + diameter + "the area of the circle " + area );
    return area;
    }
    public static void main(String[] args) {
        DebugCircle circle = new DebugCircle(5);
        circle.getArea();
    }
    }
