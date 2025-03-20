import Employee.Employee;

class Payroll {
    public static void printPayslips(Organization organization) {
        System.out.println("Payslips for Employees:");
        for (Employee employee : organization.getAllEmployees()) {
            System.out.println("Employee: " + employee.getName());
            System.out.println("Basic Salary: $" + employee.getBasicSalary());
            System.out.println("Bonus: $" + employee.getBonus());
            System.out.println("Total Compensation: $" + employee.getCompensation());
            System.out.println("----------------------");
        }
    }
}