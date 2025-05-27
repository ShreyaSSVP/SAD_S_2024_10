package SOLID;

public class DIP_02 {

    // High-level abstraction
    public interface Notification {
        void doNotify();
    }

    // Low-level module: EmailNotification
    public static class EmailNotification implements Notification {
        @Override
        public void doNotify() {
            System.out.println("Sending notification via email!!");
        }
    }

    // High-level module depends on abstraction, not implementation
    public static class Employee {
        private Notification notification;

        // DIP applied: inject interface, not concrete class
        public Employee(Notification notification) {
            this.notification = notification;
        }

        public void notifyEmployee() {
            notification.doNotify();
        }
    }

    // Main method
    public static void main(String[] args) {
        Notification email = new EmailNotification();

        Employee employee1 = new Employee(email);
        employee1.notifyEmployee(); 
    }
}
