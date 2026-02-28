package W3bg3;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Asep",  2900000, 1, 10, 2007);
        staff[1] = new Employee("Febri",  2500000, 1, 12, 2005);
        staff[2] = new Employee("Acep",   3000000, 1, 11, 2006);

        for (Employee e : staff) e.raiseSalary(5);

        System.out.println("=== Setelah Kenaikan Gaji 5% ===");
        for (Employee e : staff) e.print();

        // Test compare
        int r = staff[0].compare(staff[1]);
        System.out.println("\nAsep vs Febri: "
            + (r < 0 ? "Asep lebih kecil" : r > 0 ? "Asep lebih besar" : "Sama"));

        // Shell sort berdasarkan gaji
        Sortable.shell_sort(staff);
        System.out.println("\n=== Setelah Shell Sort ===");
        for (Employee e : staff) e.print();
    }
}


