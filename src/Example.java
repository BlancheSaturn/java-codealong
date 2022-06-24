import java.util.Scanner;

public class Example {
    Here is the RoomCarpet.java:

    class RoomCarpet //extends RoomDimension
    {
        RoomDimension size;
        double carpetCost;
        public RoomCarpet(RoomDimension dim, double cost)
        {
            size = new RoomDimension(dim.getLength(), dim.getWidth());
            carpetCost = cost;
        }
        public double getTotalCost()
        {
            return carpetCost;
        }
        public String toString()
        {
            String output = size + "\nCarpet cost: $" + carpetCost * size.getArea();
            return output;
        }
    }

    And RoomDimension.java:

    class RoomDimension
    {
        double length;
        double width;
        public RoomDimension(double len, double w)
        {
            length = len;
            width = w;
        }
        public double getLength()
        {
            return length;
        }
        public double getWidth()
        {
            return width;
        }
        public double getArea()
        {
            return length * width;
        }
        public String toString()
        {
            String output;
            output = "Room dimensions:\nLength: " + length + "\nWidth: " + width + "\nArea: " + getArea();
            return output;
        }
    }

    CarpetCalculator.java:

            import java.util.Scanner;

    public class CarpetCalculator
    {
        public static void main(String[] args)
        {
            final double CARPET_PRICE = 8.0; // Price per square foot
            double length; // To input room length
            double width; // To input room width
            RoomDimension dimensions; // To hold room dimensions
            RoomCarpet room; // To determine cost
// Create a Scanner object for keyboard input.
            Scanner scanner = new Scanner(System.in);

// Display intro.
            System.out.println("This program will display price to " +
                    "carpet a room. You must input the " +
                    "room's dimensions in feet and inches.");

// Get the length of the room.
            System.out.print("Enter the length first: ");
            length = scanner.nextDouble();

// Get the width of the room.
            System.out.print("Now enter the width: ");
            width = scanner.nextDouble();

// Create RoomDimension and RoomCarpet objects.
            dimensions = new RoomDimension(length, width);
            room = new RoomCarpet(dimensions, CARPET_PRICE);

// Display the dimensions and cost.
            System.out.println(room);
        }
    }


}
