import java.util.ArrayList;
import java.util.List;
import Employee.Employee;

class Organization {
    private String name;
    private List<Department> departments;

    public Organization(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public boolean addDepartment(Department department) {
        return departments.add(department);
    }

    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = new ArrayList<>();
        for (Department dept : departments) {
            allEmployees.addAll(dept.getEmployees());
        }
        return allEmployees;
    }
}