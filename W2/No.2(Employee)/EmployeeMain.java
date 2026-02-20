
import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.EmployeeService;

public class EmployeeMain {
    public static void main(String[]args){
        Department deptIT = new Department("IT");
        Department deptHR = new Department("HR");
        
        EmploymentType fullTime = new EmploymentType("Full-Time");
        EmploymentType partTime = new EmploymentType("Part-Time");
        
        Employee emp1 = new Employee(1, "Asep", deptIT, fullTime, 5000);
        Employee emp2 = new Employee(2, "Agus", deptHR, partTime, 3000);

        EmployeeService employeeService = new EmployeeService();
        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);
    
        employeeService.raiseSalary(1, 10); // Kenaikan gaji 10% untuk karyawan dengan ID 1
        employeeService.raiseSalary(2, 5);  // Kenaikan gaji 5% untuk karyawan dengan ID 2
        
        tampilEmployee(employeeService, 1);
        System.out.println();
        tampilEmployee(employeeService, 2);
        System.out.println();
        
    }

    public static void tampilEmployee(EmployeeService employeeService, int id) {
        Employee emp = employeeService.getEmployee(id);
        if (emp != null) {
            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Department: " + emp.getDepartment().getName());
            System.out.println("Employment Type: " + emp.getType().getType());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Salary after raise: " + emp.getSalary());
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }


}

