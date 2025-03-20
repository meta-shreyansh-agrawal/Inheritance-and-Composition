package Employee;

class Developer extends Employee {
    public Developer(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double getBonus() {
        return 0.1 * basicSalary; // 10% Bonus
    }
}
