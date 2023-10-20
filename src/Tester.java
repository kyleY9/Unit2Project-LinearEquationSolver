// this file is just for testing out my methods; it is not part of the assignment
public class Tester {
    public static void main(String[] args) {
        LinearEquation obj = new LinearEquation(1, 2, 3, 5);
        System.out.println(obj.slope());
        System.out.println(obj.yIntercept(obj.slope()));
        System.out.println(obj.distance());
    }
}
