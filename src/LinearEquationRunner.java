import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        // scanning
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please enter coords in the format (x, y)");
        System.out.print("Enter first coordinate: " );
        String coord1 = scan.nextLine();
        System.out.print("Enter second coordinate: ");
        String coord2 = scan.nextLine();

        // parsing out x and y values
        int x1 = Integer.parseInt(coord1.substring(1, coord1.indexOf(",")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(" ")+1, coord1.length()-1));
        int x2 = Integer.parseInt(coord2.substring(1, coord2.indexOf(",")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(" ")+1, coord2.length()-1));

        // checking if points are on a vertical line
        if (x1 == x2) {
            System.out.println("\nThese points fall on a vertical line. Its equation is x = " + x1);
            return;
        }

        // object creation
        LinearEquation obj = new LinearEquation(x1, y1, x2, y2);

        // more printing
        System.out.println("\n" + obj.lineInfo());
        System.out.print("\nEnter any value for x: ");
        double xValue = scan.nextDouble();
        System.out.println("When x = " + xValue + ", the coordinate is " + obj.coordinateForX(xValue));
    }
}
