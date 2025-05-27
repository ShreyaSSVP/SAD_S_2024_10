package SOLID;

public class OCP_02 {

    // Abstract base class for all shapes
    public static abstract class Shape {
        public abstract double getArea();
    }

    // Square shape
    public static class Square extends Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }
    }

    // Circle shape
    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // Triangle shape
    public static class Triangle extends Shape {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return 0.5 * base * height;
        }
    }

    // AreaCalculator class that calculates area of any shape
    public static class AreaCalculator {
        public double getArea(Shape shape) {
            return shape.getArea();
        }
    }

   // Main method 
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(4, 6);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Square Area: " + calculator.getArea(square));   
        System.out.println("Circle Area: " + calculator.getArea(circle));   
        System.out.println("Triangle Area: " + calculator.getArea(triangle));
    }
}