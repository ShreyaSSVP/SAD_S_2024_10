package SOLID;

public class ISP_02 {

    // interfaces for work functionality 
    public interface Workable {
        void work();
    }

    // interfaces for rest functionality
    public interface Restable {
        void rest();
    }

    // Developer works and rests
    public static class Developer implements Workable, Restable {
        @Override
        public void work() {
            System.out.println("Developer is coding on a beautiful day.");
        }

        @Override
        public void rest() {
            System.out.println("Developer is making a break!");
        }
    }

    // Robot only works, doesn't rest
    public static class Robot implements Workable {
        @Override
        public void work() {
            System.out.println("Robot is working hard like a machine.");
        }
    }

    public static void workingCycle(Workable worker) {
        worker.work();
    }

    public static void restingCycle(Restable worker) {
        worker.rest();
    }

    
    public static void main(String[] args) {
        Developer developer = new Developer();
        Robot robot = new Robot();

        // Now we can call working and resting cycles separately
        workingCycle(developer);
        restingCycle(developer); 
        System.out.println("-----------");
        workingCycle(robot);
        
    }
}
