import java.sql.SQLOutput;

public class Employee {
    private double Salary;
    private String Name;

    public Employee(String x, double y) {
        this.Name = x;
        this.Salary = y;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }

    public static void main(String[] args) {
        Employee obj = new Employee("tahmina", 20000);
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());

    }
}