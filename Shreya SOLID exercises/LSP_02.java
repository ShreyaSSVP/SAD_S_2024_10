package SOLID;

public class LSP_02 {

    // General base class for all birds
    public static abstract class Bird {
        public void move() {
            System.out.println("The bird is moving...");
        }
    }

    // Interface for flying behavior
    public interface FlyingBird {
        void fly();
    }

    //  Sparrow can fly
    public static class Sparrow extends Bird implements FlyingBird {
        @Override
        public void fly() {
            System.out.println("The sparrow is flying...");
        }
    }

    // Penguin cannot fly
    public static class Penguin extends Bird {
        public void swim() {
            System.out.println("The penguin is swimming...");
        }
    }

    // Move function for any bird
    public static void move(Bird bird) {
        bird.move(); 
    }

    // Fly function for only flying birds
    public static void fly(FlyingBird bird) {
        bird.fly(); 
    }

      //Main Method
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        fly((FlyingBird) sparrow);  
    }
}
