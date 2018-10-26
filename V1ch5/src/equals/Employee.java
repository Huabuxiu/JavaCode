package equals;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee
{
    private  String name;
    private  double salary;
    private  Date hireDay;

    public Employee(String name, double salary,int year, int month ,int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1, day);
        hireDay = calendar.getTime();
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary *byPercent/100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    @Override
    public boolean equals(Object OtherObject) {
        if (this == OtherObject) return true;

        if(OtherObject == null ) return false;

        if(getClass() != OtherObject.getClass()) return false;

        Employee other = (Employee) OtherObject;
        return Objects.equals(name,other.name) && salary ==other.salary && Objects.equals(hireDay,other.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,salary,hireDay);
    }

    @Override
    public String toString() {
        return  getClass().getName()+"[name= "+name+"salary = "+salary+"hirDay="+hireDay+"]";
    }
}
