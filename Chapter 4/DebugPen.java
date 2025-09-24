public class DebugPen {
    private String color;
    private String point;

    // Default constructor
    public DebugPen() {
        color = "black";
        point = "fine";
    }

    // Parameterized constructor
    public DebugPen(String color, String point) {
        this.color = color;
        this.point = point;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Getter for point
    public String getPoint() {
        return point;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create pen using default constructor
        DebugPen pen1 = new DebugPen();
        System.out.println("Pen1 - Color: " + pen1.getColor() + ", Point: " + pen1.getPoint());

        // Create pen using parameterized constructor
        DebugPen pen2 = new DebugPen("blue", "medium");
        System.out.println("Pen2 - Color: " + pen2.getColor() + ", Point: " + pen2.getPoint());
    }
}
