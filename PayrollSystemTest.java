import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Employee.Developer;
import Employee.Employee;
import Employee.Manager;

import java.util.List;

class PayrollSystemTest {
    private Organization organization;
    private Department devDept;
    private Department hrDept;
    private Employee dev1;
    private Employee dev2;
    private Employee manager1;

    @BeforeEach
    void setUp() {
        organization = new Organization("TestOrg");

        devDept = new Department("Development");
        hrDept = new Department("Human Resources");

        organization.addDepartment(devDept);
        organization.addDepartment(hrDept);

        dev1 = new Developer("Alice", 5000);
        dev2 = new Developer("Bob", 5500);
        manager1 = new Manager("Charlie", 8000);

        devDept.join(dev1);
        devDept.join(dev2);
        hrDept.join(manager1);
    }

    @Test
    void testEmployeeBasicSalary() {
        assertEquals(5000, dev1.getBasicSalary());
        assertEquals(5500, dev2.getBasicSalary());
        assertEquals(8000, manager1.getBasicSalary());
    }

    @Test
    void testEmployeeBonus() {
        assertEquals(500, dev1.getBonus());  
        assertEquals(550, dev2.getBonus());
        assertEquals(1600, manager1.getBonus()); 
    }

    @Test
    void testEmployeeCompensation() {
        assertEquals(5500, dev1.getCompensation()); 
        assertEquals(6050, dev2.getCompensation()); 
        assertEquals(9600, manager1.getCompensation()); 
    }

    @Test
    void testDepartmentJoinAndRelieve() {
        assertTrue(devDept.getEmployees().contains(dev1));
        assertTrue(devDept.getEmployees().contains(dev2));
        
        devDept.relieve(dev1);
        assertFalse(devDept.getEmployees().contains(dev1));
    }

    @Test
    void testOrganizationAllEmployees() {
        List<Employee> allEmployees = organization.getAllEmployees();
        assertEquals(3, allEmployees.size());
    }

    @Test
    void testAddDepartment() {
        Department financeDept = new Department("Finance");
        assertTrue(organization.addDepartment(financeDept));
    }
}