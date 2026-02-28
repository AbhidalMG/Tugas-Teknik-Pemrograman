package W3bg3;

public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Asep",  2000000, 1, 10, 2007);
        staff[1] = new Manager("Febri",   2500000, 1, 12, 2005);
        staff[2] = new Employee("Acep",   3000000, 1, 11, 2006);

        for (Employee e : staff) e.raiseSalary(5);

        System.out.println("=== ManagerTest (Polimorfisme) ===");
        for (Employee e : staff) e.print();
    }
}

