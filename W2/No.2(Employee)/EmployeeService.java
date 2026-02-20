package id.ac.polban.employee.service;

import java.util.HashMap;
import java.util.Map;

import id.ac.polban.employee.model.*;

public class EmployeeService {
    private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
    }
    
    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void raiseSalary(int id, double percent) {
        Employee emp = employees.get(id);
        if (emp != null) {
            emp.setSalary(emp.getSalary() * (1 + percent/100));
        }
    }

    public void tampilEmployee(int id) {
        Employee emp = employees.get(id);
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


