public class LinearEquation {
    // instance variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // constructors
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // methods
    public String equation() {

    }

    public double distance() {
        double distance = roundedToHundreth()
    }
    public double slope() {
        double slope = roundedToHundreth((y2 - y1) / (x2 - x1));
        return slope;
    }
    public double roundedToHundreth(double toRound) {
        return Math.round(toRound*100.0)/100.0;
    }

}
