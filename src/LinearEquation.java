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
    public String equation() {  // prepare for many if statements here~
        // variable initializations (only for this method)
        int numerator = Math.abs(y2 - y1);
        int denominator = Math.abs(x2 - x1);
        double slope = slope();
        String yIntercept = "";

        // if statement for whether the y-intercept is negative or positive
        if (yIntercept(slope) > 0 ) {
             yIntercept = " + " + yIntercept(slope);
        } else if (yIntercept(slope) < 0) {
             yIntercept = " - " + Math.abs(yIntercept(slope));
        }

        // if statement for horizontal lines (y1=y2)
        if (y1 == y2) {
            return "y = " + yIntercept(slope);
        }

        // if statement for whether the slope is -1 or 1
        if (slope == -1) {
            return "y = -x " + yIntercept;
        } else if (slope == 1) {
            return "y = x " + yIntercept;
        }

        // if statement for whether the slope is a whole number or a fraction
        if (Math.floor(slope) - slope == 0) {
            if (slope > 0) {
                return "y = " + (int) slope + "x" + yIntercept;
            } else {
                return "y = -" + (int) Math.abs(slope) + "x" + yIntercept;
            }
        } else {
            if (slope > 0) {
                return "y = " + numerator + "/" + denominator + "x" + yIntercept;
            } else {
                return "y = -" + numerator + "/" + denominator + "x" + yIntercept;
            }
        }
    }

    // the slope-intercept equation in terms of the y-intercept (b) is b=y-mx
    public double yIntercept(double slopeInput) {
        return y1 - slopeInput*x1;
    }

    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
    }

    public double slope() {
        return roundedToHundredth((double) (y2-y1) / (x2-x1));
    }

    public String coordinateForX(double xValue) {
        double yValue = xValue*slope() + yIntercept(slope());
        return "(" + xValue + ", " + roundedToHundredth(yValue) + ")";
    }

    public String lineInfo() {
        return "----- Line Info -----\nPoints: (" + x1 + ", " + y1 + "), " + "(" + x2 + ", " + y2 + ")\nEquation: " + equation() + "\nSlope: " + slope() + "\ny-intercept: " + yIntercept(slope()) + "\nDistance: " + distance();
    }

    // helper method
    public double roundedToHundredth(double toRound) {
        return Math.round(toRound*100.0)/100.0;
    }
}
