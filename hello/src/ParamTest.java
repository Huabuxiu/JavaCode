import java.util.Random;

public class ParamTest {
    public static void main(String[] args) {
            Employee[] staff = new Employee[3];
            staff[0] = new Employee("Harry",40000);
            staff[1] = new Employee(60000);
            staff[2] = new Employee();


        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
                    + e.getSalary());
    }

}

class Employee // simplified Employee class
{
    private static int nextId;

    private int id;
    private String name;
    private double salary;

    static
    {
        Random generator  = new Random();

        nextId = generator.nextInt(10000);
    }
    {
        id = nextId;
        nextId++;
    }



    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        this("Employee #"+nextId ,s);
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}