import java.util.Scanner;

public class DebugFour4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String destinationCity;
        String departureCity;
        String mode;

        DebugTrip trip1;
        DebugTrip trip2;
        DebugTrip trip3;

        System.out.print("Enter destination city >> ");
        destinationCity = input.nextLine();

        System.out.print("Enter departure city >> ");
        departureCity = input.nextLine();

        System.out.print("Enter mode of transportation >> ");
        mode = input.nextLine();

        // Using different constructors
        trip1 = new DebugTrip(destinationCity);                       // 1-arg
        trip2 = new DebugTrip(destinationCity, departureCity);        // 2-arg
        trip3 = new DebugTrip(destinationCity, departureCity, mode);  // 3-arg

        display(trip1);
        display(trip2);
        display(trip3);
    }

    public static void display(DebugTrip trip) {
        System.out.println("Going to " + trip.getDestination());
        System.out.println(" Leaving from " + trip.getDepartureCity());
        System.out.println(" Going by " + trip.getMode());
        System.out.println();
    }
}

// DebugTrip class in same file
class DebugTrip {
    private String destination;
    private String departure;
    private String mode;

    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";

    // 1-argument constructor
    public DebugTrip(String destination) {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }

    // 2-argument constructor
    public DebugTrip(String destination, String departure) {
        this(destination, departure, DEFAULT_MODE);
    }

    // 3-argument constructor
    public DebugTrip(String destination, String departure, String mode) {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureCity() {
        return departure;
    }

    public String getMode() {
        return mode;
    }
}
