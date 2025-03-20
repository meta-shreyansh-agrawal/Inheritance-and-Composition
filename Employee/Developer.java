package Employee;

public class Developer extends Employee {
    public Developer(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double getBonus() {
        return 0.2 * basicSalary;
    }
}
