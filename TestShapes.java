import Graphics.*;
import java.util.Scanner;

public class TestShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length, width, base, height, side, radius;

        System.out.print("Enter length of Rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + rectangle.area());

        System.out.print("\nEnter base of Triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter height of Triangle: ");
        height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);
        System.out.println("Area of Triangle: " + triangle.area());

        System.out.print("\nEnter side of Square: ");
        side = scanner.nextDouble();
        Square square = new Square(side);
        System.out.println("Area of Square: " + square.area());

        System.out.print("\nEnter radius of Circle: ");
        radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.area());

        scanner.close();
    }
}
