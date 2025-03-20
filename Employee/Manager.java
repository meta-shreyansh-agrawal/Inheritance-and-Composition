package Employee;

public class Manager extends Employee {
    public Manager(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double getBonus() {
        return 0.3 * basicSalary;
    }
}