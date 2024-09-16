import java.util.Scanner;
public class c_Calculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final double PI = 3.14159;
    System.out.print("Enter radius here: ");
    double radius = input.nextDouble();
        double diameter = 2 * radius;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("The Radius of the circle = %.3f%n", radius);
        System.out.println("The Diameter of the circle = %.3f%n", diameter);
        System.out.println("The Area of the circle = %.3f%n", area);
        System.out.println("The Circumference of the circle = %.3f%n", circumference);
    }
}
/*
java -cp /tmp/Sj8vncBF7n/c_Calculator
Enter radius here: 17
The Radius of the circle = 17.000
The Diameter of the circle = 34.000
The Area of the circle = 907.920
The Circumference of the circle = 106.814
*/
