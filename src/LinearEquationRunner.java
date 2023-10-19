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

        // object creation
        LinearEquation obj = new LinearEquation(x1, y1, x2, y2);

    }
}
