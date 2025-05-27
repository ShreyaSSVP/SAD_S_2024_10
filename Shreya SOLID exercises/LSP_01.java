package SOLID;

public class LSP_01 {

    //Common interface for all shapes
    public interface Shape {
        double getArea();
    }

    //Rectangle implements Shape
    public static class Rectangle implements Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public double getArea() {
            return width * height;
        }
    }

    //Square implements Shape
    public static class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }
    }

    //Main Method
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(5);

        System.out.println("Rectangle Area: " + rectangle.getArea()); 
        System.out.println("Square Area: " + square.getArea());       
    }
}
