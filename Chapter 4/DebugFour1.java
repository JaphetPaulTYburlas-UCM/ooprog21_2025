import java.util.Scanner;

public class DebugFour1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius for a circle >> ");
        int radius = input.nextInt();

        // Create a DebugCircle object with the given radius
        DebugCircle c = new DebugCircle(radius);

        System.out.println("The radius is " + c.getRad());
        System.out.println("The diameter is " + c.getDiam());
        System.out.println("The area is " + c.getArea());
    }
}

// DebugCircle class in the same file
class DebugCircle {
    private int radius;

    // Constructor that accepts radius
    public DebugCircle(int r) {
        if (r < 0) {
            System.out.println("Radius cannot be negative. Setting radius to 0.");
            radius = 0;
        } else {
            radius = r;
        }
    }

    public int getRad() {
        return radius;
    }

    public int getDiam() {
        return radius * 2;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
