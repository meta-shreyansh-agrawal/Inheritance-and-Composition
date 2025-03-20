abstract class Employee {
    String name; 
    double basicSalary; 

    public Employee(String name, double basicSalary){
        this.name = name;
        this.basicSalary = basicSalary; 
    }

    public abstract double getBonus();
    
    public double getCompensation() {
        return basicSalary + getBonus();
    }

    public String getName() {
        return name;
    }
    
    public double getBasicSalary() {
        return basicSalary;
    }


}
