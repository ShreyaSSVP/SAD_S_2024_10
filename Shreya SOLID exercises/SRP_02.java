package SOLID;

public class SRP_02 {

    // Handles employee-related logic
    public static class Employee {
        public String getDesignation(int employeeID) {
            return "Software Engineer";
        }
    }

    // Handles salary updates
    public static class SalaryService {
        public void updateSalary(int employeeID) {
            System.out.println("Salary updated for employee ID: " + employeeID);
        }
    }

    // Handles email notifications
    public static class EmailService {
        public void sendMail() {
            System.out.println("Mail sent to employee.");
        }
    }

    // Main method 
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Designation: " + employee.getDesignation(101));

        SalaryService salaryService = new SalaryService();
        salaryService.updateSalary(100);

        EmailService emailService = new EmailService();
        emailService.sendMail();
    }
}
