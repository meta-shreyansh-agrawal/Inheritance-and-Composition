import java.util.ArrayList;
import java.util.List;
import Employee.*;

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public boolean join(Employee employee) {
        return employees.add(employee);
    }

    public boolean relieve(Employee employee) {
        return employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}